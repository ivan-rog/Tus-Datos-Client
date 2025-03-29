package com.tusdatos.bussines;

import com.tusdatos.configuration.WebClientConfig;
import com.tusdatos.rest.TusDatosApiRest;
import okhttp3.mockwebserver.MockResponse;
import okhttp3.mockwebserver.MockWebServer;
import okhttp3.mockwebserver.SocketPolicy;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.test.util.ReflectionTestUtils;
import org.springframework.web.reactive.function.client.ExchangeFilterFunctions;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import reactor.core.Exceptions;
import reactor.test.StepVerifier;

import java.io.IOException;

@ExtendWith(MockitoExtension.class)
@Execution(ExecutionMode.CONCURRENT)
class TusDatosServiceTest {

    private MockWebServer mockWebServer;
    private TusDatosService tusDatosService;

    @BeforeEach
    void setUp() throws IOException {
        this.mockWebServer = new MockWebServer();
        this.mockWebServer.start();
        var webClientConfig = new WebClientConfig();
        var tusDatosApiRest = new TusDatosApiRest(webClientConfig.createWebClient(), ExchangeFilterFunctions.basicAuthentication("", ""), this.mockWebServer.url("/").toString());
        this.tusDatosService = new TusDatosService(tusDatosApiRest);
        ReflectionTestUtils.setField(this.tusDatosService, "endpointLaunch", "/api/launch");
        ReflectionTestUtils.setField(this.tusDatosService, "endpointJobStatus", "/api/results/{jobkey}");
        ReflectionTestUtils.setField(this.tusDatosService, "endpointJobRetry", "/api/retry/{id}?typedoc={typedoc}");
        ReflectionTestUtils.setField(this.tusDatosService, "endpointReportJson", "/api/report_json/{id}");
    }

    @AfterEach
    void tearDown() throws IOException {
        this.mockWebServer.shutdown();
    }

    @Test
    @Tag("tus_datos")
    void when_process_the_CC_111_document() {
        this.enqueueResponseCC111();
        StepVerifier.create(this.tusDatosService.processDocuments(LaunchMock.launchRequestCC111()))
                .expectNextMatches(reportJsonResponseDTO -> "111-1".equals(reportJsonResponseDTO.rut()))
                .verifyComplete();
    }

    private void enqueueResponseCC111() {
        mockWebServer.enqueue(new MockResponse()
                .setHeader("Content-Type", "application/json")
                .setResponseCode(HttpStatus.OK.value())
                .setBody(LaunchMock.launchResponseCC111())
        );
        mockWebServer.enqueue(new MockResponse()
                .setHeader("Content-Type", "application/json")
                .setResponseCode(HttpStatus.OK.value())
                .setBody(JobStatusMock.jobStatusCC11())
        );
        mockWebServer.enqueue(new MockResponse()
                .setHeader("Content-Type", "application/json").
                setResponseCode(HttpStatus.OK.value())
                .setBody(ReportJson.reportJsonCC111())
        );
    }

    @Test
    @Tag("tus_datos")
    void when_the_service_has_timeout() {
        mockWebServer.enqueue(new MockResponse().setSocketPolicy(SocketPolicy.NO_RESPONSE));
        StepVerifier.create(this.tusDatosService.processDocuments(LaunchMock.launchRequestCC111()))
                .expectErrorMatches(Exceptions::isRetryExhausted)
                .verify();
    }

    @Test
    @Tag("tus_datos")
    void when_the_service_returns_a_500_error() {
        mockWebServer.enqueue(new MockResponse().setResponseCode(HttpStatus.INTERNAL_SERVER_ERROR.value()));
        StepVerifier.create(this.tusDatosService.processDocuments(LaunchMock.launchRequestCC111()))
                .expectErrorMatches(Exceptions::isRetryExhausted)
                .verify();
    }

    @Test
    @Tag("tus_datos")
    void when_the_service_returns_a_401_error() {
        mockWebServer.enqueue(new MockResponse().setResponseCode(HttpStatus.UNAUTHORIZED.value()));
        StepVerifier.create(this.tusDatosService.processDocuments(LaunchMock.launchRequestCC111()))
                .expectErrorMatches(throwable -> ((WebClientResponseException) throwable).getStatusCode().is4xxClientError())
                .verify();
    }
}