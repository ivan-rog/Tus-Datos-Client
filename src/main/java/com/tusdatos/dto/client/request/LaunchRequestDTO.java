package com.tusdatos.dto.client.request;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.tusdatos.dto.client.enums.DocumentTypes;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class LaunchRequestDTO {

    @JsonProperty("doc")
    @JsonAlias("doc")
    private String documentNumber;
    
    @JsonProperty("typedoc")
    @JsonAlias("typedoc")
    private DocumentTypes documentTypes;
    
    @JsonProperty("fechaE")
    @JsonAlias("fechaE")
    private String expirationDate;
    
    private boolean force;

}
