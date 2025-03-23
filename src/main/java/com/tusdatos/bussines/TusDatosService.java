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

    /**
     * Constructor for TusDatosService.
     *
     * @param apiRest the API rest client
     */
    TusDatosService(APIRest apiRest) {
        this.apiRest = apiRest;
    }

    /**
     * Processes documents by launching a request, checking job status, retrying if necessary, and retrieving the report.
     *
     * @param launchRequestDTO the launch request data transfer object
     * @return a Mono emitting the report JSON response data transfer object
     */
    public Mono<ReportJsonResponseDTO> processDocuments(final LaunchRequestDTO launchRequestDTO) {
        return this.launch(launchRequestDTO).
                flatMap(this::jobStatus).
                flatMap(this::retryJob).
                flatMap(this::reportJob).
                publishOn(Schedulers.boundedElastic());
    }

    /**
     * Launches a request to the external API.
     *
     * @param launchRequestDTO the launch request data transfer object
     * @return a Mono emitting the launch response data transfer object
     */
    private Mono<LaunchResponseDTO> launch(final LaunchRequestDTO launchRequestDTO) {
        return this.apiRest.post(this.endpointLaunch, launchRequestDTO, LaunchResponseDTO.class);
    }

    /**
     * Checks the job status by repeatedly sending GET requests until the job is finalized.
     *
     * @param launchResponseDTO the launch response data transfer object
     * @return a Mono emitting the job status response data transfer object
     */
    private Mono<JobStatusResponseDTO> jobStatus(final LaunchResponseDTO launchResponseDTO) {
        var uri = this.getUri(this.endpointJobStatus, launchResponseDTO.jobId());
        return Flux.interval(Duration.ofSeconds(30), Duration.ofSeconds(15)).
                flatMap(i -> this.apiRest.get(uri.toString(), JobStatusResponseDTO.class)).
                takeUntil(jobStatusResponseDTO -> "finalizado".equals(jobStatusResponseDTO.status())).
                last().timeout(Duration.ofMinutes(2));
    }

    /**
     * Checks the job status by repeatedly sending GET requests until the job is finalized.
     *
     * @param retryJobResponseDTO the retry job response data transfer object
     * @return a Mono emitting the job status response data transfer object
     */
    private Mono<JobStatusResponseDTO> jobStatus(final RetryJobResponseDTO retryJobResponseDTO) {
        var uri = this.getUri(this.endpointJobStatus, retryJobResponseDTO.jobId());
        return Flux.interval(Duration.ofSeconds(30), Duration.ofSeconds(15)).
                flatMap(i -> this.apiRest.get(uri.toString(), JobStatusResponseDTO.class)).
                takeUntil(jobStatusResponseDTO -> "finalizado".equals(jobStatusResponseDTO.status())).
                last().timeout(Duration.ofMinutes(2));
    }

    /**
     * Retries the job if there was an error and the error source is valid.
     *
     * @param jobStatusResponseDTO the job status response data transfer object
     * @return a Mono emitting the job status response data transfer object
     */
    private Mono<JobStatusResponseDTO> retryJob(final JobStatusResponseDTO jobStatusResponseDTO) {
        if(jobStatusResponseDTO.error() && validateSource(jobStatusResponseDTO.errors())) {
            var uri =  this.getUri(this.endpointJobRetry, jobStatusResponseDTO.id(), jobStatusResponseDTO.cedula());
            return Flux.range(0, 3).
                    flatMap( attempt -> this.apiRest.get(uri.toString(), RetryJobResponseDTO.class)).
                    flatMap(this::jobStatus).
                    takeUntil(
                            jobStatusResponseDTORetry -> jobStatusResponseDTO.error() && validateSource(jobStatusResponseDTORetry.errors())
                    ).last();
        }
        return Mono.just(jobStatusResponseDTO);
    }

    /**
     * Retrieves the final report for the job.
     *
     * @param jobStatusResponseDTO the job status response data transfer object
     * @return a Mono emitting the report JSON response data transfer object
     */
    private Mono<ReportJsonResponseDTO> reportJob(final JobStatusResponseDTO jobStatusResponseDTO) {
        var uri = this.getUri(this.endpointReportJson, jobStatusResponseDTO.id());
        return this.apiRest.get(uri.toString(), ReportJsonResponseDTO.class);
    }

    /**
     * Constructs a URI from a base URI string and a set of URI variables.
     *
     * @param uri the base URI string
     * @param uriVariables the URI variables
     * @return the constructed URI
     */
    private URI getUri(final String uri, Object... uriVariables) {
        return UriComponentsBuilder.fromUriString(uri)
                .encode()
                .buildAndExpand(uriVariables)
                .toUri();
    }

    /**
     * Validates if any of the errors in the list match a predefined set of sources.
     *
     * @param errors the list of errors
     * @return true if any error matches a predefined source, false otherwise
     */
    private boolean validateSource(List<String> errors){
        return errors.stream().anyMatch(this.sources::contains);
    }

}