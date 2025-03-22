package com.tusdatos.bussines;

import com.tusdatos.dto.client.request.LaunchRequestDTO;
import com.tusdatos.dto.client.response.ReportJsonResponseDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class DocumentService {

    private final TusDatosService tusDatosService;

    public DocumentService(final TusDatosService tusDatosService) {
        this.tusDatosService = tusDatosService;
    }

    public void launch(final LaunchRequestDTO launchRequestDTO) {
        this.tusDatosService.processDocuments(launchRequestDTO).
                subscribe(this::onSuccess, this::onError);
    }

    private void onSuccess(ReportJsonResponseDTO reportJsonResponseDTO) {
        log.info("Respuesta TUS DATOS: {}", reportJsonResponseDTO.toString());
    }

    private void onError(Throwable throwable) {
        log.error("Error TUS_DATOS: {}", throwable.getMessage(), throwable);
    }

}
