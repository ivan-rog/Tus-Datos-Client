package com.tusdatos.bussines;

import com.tusdatos.dto.client.request.LaunchRequestDTO;
import com.tusdatos.dto.client.response.JobStatusResponseDTO;
import com.tusdatos.dto.client.response.LaunchResponseDTO;
import com.tusdatos.dto.client.response.ReportJsonResponseDTO;
import com.tusdatos.dto.client.response.RetryJobResponseDTO;
import com.tusdatos.rest.APIRest;
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

    private final APIRest apiRest;

    @Value("${configuration.tusdatos.endpoint.launch}")
    private String endpointLaunch;

    @Value("${configuration.tusdatos.endpoint.job.status}")
    private String endpointJobStatus;

    @Value("${configuration.tusdatos.endpoint.job.retry}")
    private String endpointJobRetry;

    @Value("${configuration.tusdatos.endpoint.report.json}")
    private String endpointReportJson;

    private final List<String> sources = List.of("interpol");

    TusDatosService(APIRest apiRest) {
        this.apiRest = apiRest;
    }

    public Mono<ReportJsonResponseDTO> processDocuments(final LaunchRequestDTO launchRequestDTO) {
        return this.launch(launchRequestDTO).
                flatMap(this::jobStatus).
                flatMap(this::retryJob).
                flatMap(this::reportJob).
                publishOn(Schedulers.boundedElastic());
    }

    private Mono<LaunchResponseDTO> launch(final LaunchRequestDTO launchRequestDTO) {
        return this.apiRest.post(this.endpointLaunch, launchRequestDTO, LaunchResponseDTO.class);
    }

    private Mono<JobStatusResponseDTO> jobStatus(final LaunchResponseDTO launchResponseDTO) {
        var uri = this.getUri(this.endpointJobStatus, launchResponseDTO.getJobId());
        return Flux.interval(Duration.ofSeconds(30), Duration.ofSeconds(15)).
                flatMap(i -> this.apiRest.get(uri.toString(), JobStatusResponseDTO.class)).
                takeUntil(jobStatusResponseDTO -> "finalizado".equals(jobStatusResponseDTO.getStatus())).
                last().timeout(Duration.ofMinutes(2));
    }

    private Mono<JobStatusResponseDTO> jobStatus(final RetryJobResponseDTO retryJobResponseDTO) {
        var uri = this.getUri(this.endpointJobStatus, retryJobResponseDTO.getJobId());
        return Flux.interval(Duration.ofSeconds(30), Duration.ofSeconds(15)).
                flatMap(i -> this.apiRest.get(uri.toString(), JobStatusResponseDTO.class)).
                takeUntil(jobStatusResponseDTO -> "finalizado".equals(jobStatusResponseDTO.getStatus())).
                last().timeout(Duration.ofMinutes(2));
    }

    private Mono<JobStatusResponseDTO> retryJob(final JobStatusResponseDTO jobStatusResponseDTO) {
        if(jobStatusResponseDTO.isError() && validateSource(jobStatusResponseDTO.getErrors())) {
            var uri =  this.getUri(this.endpointJobRetry, jobStatusResponseDTO.getId(), jobStatusResponseDTO.getCedula());
            return Flux.range(0, 3).
                    flatMap( attempt -> this.apiRest.get(uri.toString(), RetryJobResponseDTO.class)).
                    flatMap(this::jobStatus).
                    takeUntil(
                            jobStatusResponseDTORetry -> jobStatusResponseDTO.isError() && validateSource(jobStatusResponseDTORetry.getErrors())
                    ).last();
        }
        return Mono.just(jobStatusResponseDTO);
    }

    private Mono<ReportJsonResponseDTO> reportJob(final JobStatusResponseDTO jobStatusResponseDTO) {
        var uri = this.getUri(this.endpointReportJson, jobStatusResponseDTO.getId());
        return this.apiRest.get(uri.toString(), ReportJsonResponseDTO.class);
    }

    private URI getUri(final String uri, Object... uriVariables) {
        return UriComponentsBuilder.fromUriString(uri)
                .encode()
                .buildAndExpand(uriVariables)
                .toUri();
    }

    private boolean validateSource(List<String> errors){
        return errors.stream().anyMatch(this.sources::contains);
    }

}
