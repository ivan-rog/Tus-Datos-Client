package com.tusdatos.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tusdatos.bussines.DocumentService;
import com.tusdatos.dto.client.request.LaunchRequestDTO;
import com.tusdatos.utils.JacksonUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/v1")
public class TusDatosController {

    private final DocumentService documentService;

    public TusDatosController(DocumentService documentService) {
        this.documentService = documentService;
    }

    @GetMapping("/launch")
    public String lauch() throws JsonProcessingException {
        this.documentService.launch(JacksonUtils.jsonToObject("{ \"doc\": 111, \"typedoc\": \"CC\", \"fechaE\": \"01/12/2014\" }", LaunchRequestDTO.class));
        return "Launch Tus";
    }
}
