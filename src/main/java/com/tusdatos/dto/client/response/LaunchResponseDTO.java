package com.tusdatos.dto.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.tusdatos.dto.client.enums.DocumentTypes;

public record LaunchResponseDTO(
    @JsonProperty("email") String mail,
    @JsonProperty("doc") String documentNumber,
    @JsonProperty("jobid") String jobId,
    @JsonProperty("nombre") String name,
    @JsonProperty("typedoc") DocumentTypes documentType,
    @JsonProperty("validado") boolean validated
) {}
