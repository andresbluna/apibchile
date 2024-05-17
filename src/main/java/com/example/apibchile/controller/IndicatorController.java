package com.example.apibchile.controller;

import com.example.apibchile.model.IndicatorData;
import com.example.apibchile.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndicatorController {


    @Autowired
    private IndicatorService indicatorService;

    @GetMapping("/indicators")
    public IndicatorData getIndicators() {
        return indicatorService.getIndicators();
    }
}
