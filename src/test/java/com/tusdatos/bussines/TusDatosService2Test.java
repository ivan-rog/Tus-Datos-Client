package com.tusdatos.bussines;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tusdatos.dto.client.request.LaunchRequestDTO;
import com.tusdatos.dto.client.response.JobStatusResponseDTO;
import com.tusdatos.dto.client.response.LaunchResponseDTO;
import com.tusdatos.dto.client.response.ReportJsonResponseDTO;
import com.tusdatos.rest.TusDatosApiRest;
import com.tusdatos.utils.JacksonUtils;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.api.parallel.Execution;
import org.junit.jupiter.api.parallel.ExecutionMode;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.test.util.ReflectionTestUtils;
import reactor.core.publisher.Mono;
import reactor.test.StepVerifier;

import java.time.Duration;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
@Execution(ExecutionMode.CONCURRENT)
class TusDatosService2Test {

    @InjectMocks
    private TusDatosService tusDatosService;

    @Mock
    private TusDatosApiRest tusDatosApiRest;

    @BeforeEach
    void setUp() {
        ReflectionTestUtils.setField(this.tusDatosService, "endpointLaunch", "/api/launch");
        ReflectionTestUtils.setField(this.tusDatosService, "endpointJobStatus", "/api/results/{jobkey}");
        ReflectionTestUtils.setField(this.tusDatosService, "endpointJobRetry", "/api/retry/{id}?typedoc={typedoc}");
        ReflectionTestUtils.setField(this.tusDatosService, "endpointReportJson", "/api/report_json/{id}");
    }


    @Test
    void when_process_the_CC_111_document() throws JsonProcessingException {
        when(tusDatosApiRest.post(anyString(), any(LaunchRequestDTO.class), eq(LaunchResponseDTO.class)))
                .thenReturn(Mono.just(JacksonUtils.jsonToObject(LaunchMock.launchResponseCC111(), LaunchResponseDTO.class)));

        when(tusDatosApiRest.get(anyString(), eq(JobStatusResponseDTO.class)))
                .thenReturn(Mono.just(JacksonUtils.jsonToObject(JobStatusMock.jobStatusCC11(), JobStatusResponseDTO.class)));

        when(tusDatosApiRest.get(anyString(), eq(ReportJsonResponseDTO.class)))
                .thenReturn(Mono.just(JacksonUtils.jsonToObject(ReportJson.reportJsonCC111(), ReportJsonResponseDTO.class)));

        StepVerifier.withVirtualTime(
                () -> {
                    try {
                        return tusDatosService.processDocuments(LaunchMock.launchRequestCC111());
                    } catch (JsonProcessingException e) {
                        throw new RuntimeException(e);
                    }
                }).expectSubscription()
                .expectNoEvent(Duration.ofSeconds(30))
                .expectNextMatches(reportJsonResponseDTO -> "111-1".equals(reportJsonResponseDTO.rut()))
                .verifyComplete();
    }

}