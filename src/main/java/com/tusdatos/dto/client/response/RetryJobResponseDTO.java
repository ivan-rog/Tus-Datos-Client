package com.tusdatos.dto.client.response;

import com.fasterxml.jackson.annotation.JsonProperty;

public record RetryJobResponseDTO(
    @JsonProperty("doc") String documentNumber,
    String jobId
) {}