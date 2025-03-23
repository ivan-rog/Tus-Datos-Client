package com.tusdatos.dto.client.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tusdatos.dto.client.enums.DocumentTypes;

public record LaunchRequestDTO(
        @JsonProperty("doc")
        @JsonAlias("doc")
        String documentNumber,

        @JsonProperty("typedoc")
        @JsonAlias("typedoc")
        DocumentTypes documentTypes,

        @JsonProperty("fechaE")
        @JsonAlias("fechaE")
        String expirationDate,

        boolean force
) {}
