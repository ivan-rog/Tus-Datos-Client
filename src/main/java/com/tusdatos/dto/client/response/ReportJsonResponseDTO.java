package com.tusdatos.dto.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ReportJsonResponseDTO(
    String rut,
    @JsonProperty("rut_estado") String rutStatus,
    @JsonProperty("nombre") String name
) {}
