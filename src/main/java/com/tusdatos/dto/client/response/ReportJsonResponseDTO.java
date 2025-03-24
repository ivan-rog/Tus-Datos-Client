package com.tusdatos.dto.client.response;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record ReportJsonResponseDTO(
    String rut,
    @JsonProperty("rut_estado") String rutStatus,
    @JsonProperty("nombre") String name
) {}
