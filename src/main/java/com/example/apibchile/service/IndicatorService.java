package com.example.apibchile.service;

import com.example.apibchile.model.IndicatorModel;
import com.example.apibchile.model.IndicatorData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndicatorService {

    private final String apiUrl;

    public IndicatorService(@Value("${mindicador.api.url}") String apiUrl) {
        this.apiUrl = apiUrl;
    }

    public IndicatorData getIndicators() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, IndicatorData.class);
    }
}
