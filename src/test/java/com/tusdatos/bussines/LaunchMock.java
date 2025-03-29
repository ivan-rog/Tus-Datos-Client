package com.tusdatos.bussines;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.tusdatos.dto.client.request.LaunchRequestDTO;
import com.tusdatos.utils.JacksonUtils;

public class LaunchMock {

    public static LaunchRequestDTO launchRequestCC111() {
        try {
            return JacksonUtils.jsonToObject("""
                    {\s
                        "doc": 111,\s
                        "typedoc": "CC",\s
                        "fechaE": "01/12/2014"\s
                    }
                    """, LaunchRequestDTO.class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    public static String launchResponseCC111()  {
        return """
                {
                    "email": "usuario@pruebas.com",
                    "doc": 111,
                    "jobid": "6460fc34-4154-43db-9438-8c5a059304c0",
                    "nombre": "MIGUEL FERNANDO PEREZ GOMEZ",
                    "typedoc": "CC",
                    "validado": true
                }
                """;
    }
}
