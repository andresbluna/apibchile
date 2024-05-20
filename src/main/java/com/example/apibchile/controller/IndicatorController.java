package com.example.apibchile.controller;

import com.example.apibchile.model.IndicatorData;
import com.example.apibchile.model.UfDetail;
import com.example.apibchile.service.IndicatorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndicatorController {


    @Autowired
    private IndicatorService indicatorService;

    @Operation(summary = "Obtiene datos de indicadores", description = "Retorna una lista de datos de indicadores.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Datos de indicadores obtenidos exitosamente."),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor.")
    })
    @GetMapping("/indicators")
    public IndicatorData getIndicators() {
        return indicatorService.getIndicators();
    }

    @Operation(summary = "Obtiene datos de UF", description = "Retorna datos detallados de UF.")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Datos de UF obtenidos exitosamente."),
            @ApiResponse(responseCode = "500", description = "Error interno del servidor.")
    })
    @GetMapping("/uf")
    public UfDetail getUfData() {
        return indicatorService.getUfData();
    }
}
