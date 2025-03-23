package com.tusdatos.bussines;

import com.tusdatos.dto.client.request.LaunchRequestDTO;
import com.tusdatos.dto.client.response.JobStatusResponseDTO;
import com.tusdatos.dto.client.response.LaunchResponseDTO;
import com.tusdatos.dto.client.response.ReportJsonResponseDTO;
import com.tusdatos.dto.client.response.RetryJobResponseDTO;
import com.tusdatos.rest.ApiRestClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.util.UriComponentsBuilder;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Schedulers;

import java.net.URI;
import java.time.Duration;
import java.util.List;

@Service
public class TusDatosService {

    private final ApiRestClient apiRest;

    @Value("${configuration.tusdatos.endpoint.launch}")
    private String endpointLaunch;

    @Value("${configuration.tusdatos.endpoint.job.status}")
    private String endpointJobStatus;

    @Value("${configuration.tusdatos.endpoint.job.retry}")
    private String endpointJobRetry;

    @Value("${configuration.tusdatos.endpoint.report.json}")
    private String endpointReportJson;

    private final List<String> sources = List.of("interpol");

    TusDatosService(ApiRestClient apiRest) {
        this.apiRest = apiRest;
    }

    public Mono<ReportJsonResponseDTO> processDocuments(LaunchRequestDTO launchRequestDTO) {
        return launch(launchRequestDTO)
                .flatMap(this::jobStatus)
                .flatMap(this::retryJob)
                .flatMap(this::reportJob)
                .publishOn(Schedulers.boundedElastic());
    }

    private Mono<LaunchResponseDTO> launch(LaunchRequestDTO launchRequestDTO) {
        return apiRest.post(endpointLaunch, launchRequestDTO, LaunchResponseDTO.class);
    }

    private Mono<JobStatusResponseDTO> jobStatus(LaunchResponseDTO launchResponseDTO) {
        var uri = getUri(endpointJobStatus, launchResponseDTO.jobId());
        return Flux.interval(Duration.ofSeconds(30), Duration.ofSeconds(15))
                .flatMap(i -> apiRest.get(uri.toString(), JobStatusResponseDTO.class))
                .takeUntil(jobStatusResponseDTO -> "finalizado".equals(jobStatusResponseDTO.status()))
                .last().timeout(Duration.ofMinutes(2));
    }

    private Mono<JobStatusResponseDTO> retryJobStatus(RetryJobResponseDTO retryJobResponseDTO) {
        var uri = getUri(endpointJobStatus, retryJobResponseDTO.jobId());
        return Flux.interval(Duration.ofSeconds(30), Duration.ofSeconds(15))
                .flatMap(i -> apiRest.get(uri.toString(), JobStatusResponseDTO.class))
                .takeUntil(jobStatusResponseDTO -> "finalizado".equals(jobStatusResponseDTO.status()))
                .last().timeout(Duration.ofMinutes(2));
    }

    private Mono<JobStatusResponseDTO> retryJob(JobStatusResponseDTO jobStatusResponseDTO) {
        if(jobStatusResponseDTO.error() && validateSource(jobStatusResponseDTO.errors())) {
            var uri =  getUri(endpointJobRetry, jobStatusResponseDTO.id(), jobStatusResponseDTO.cedula());
            return Flux.range(0, 3)
                    .flatMap( attempt -> apiRest.get(uri.toString(), RetryJobResponseDTO.class))
                    .flatMap(this::retryJobStatus)
                    .takeUntil(jobStatusResponseDTORetry -> jobStatusResponseDTO.error() && validateSource(jobStatusResponseDTORetry.errors()))
                    .last();
        }
        return Mono.just(jobStatusResponseDTO);
    }

    private Mono<ReportJsonResponseDTO> reportJob(JobStatusResponseDTO jobStatusResponseDTO) {
        var uri = getUri(endpointReportJson, jobStatusResponseDTO.id());
        return apiRest.get(uri.toString(), ReportJsonResponseDTO.class);
    }

    private URI getUri(String uri, Object... uriVariables) {
        return UriComponentsBuilder.fromUriString(uri)
                .encode()
                .buildAndExpand(uriVariables)
                .toUri();
    }

    private boolean validateSource(List<String> errors){
        return errors.stream().anyMatch(sources::contains);
    }

}