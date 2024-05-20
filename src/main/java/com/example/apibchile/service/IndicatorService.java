package com.example.apibchile.service;

import com.example.apibchile.model.IndicatorData;
import com.example.apibchile.model.UfDetail;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class IndicatorService {

    private final String apiUrl;
    private final String uf;

    public IndicatorService(@Value("${mindicador.api.url}") String apiUrl,
                            @Value("${mindicador.api.uf}")  String uf){
        this.apiUrl = apiUrl;
        this.uf = uf;
    }

    public IndicatorData getIndicators() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(apiUrl, IndicatorData.class);
    }

    public UfDetail getUfData() {
        RestTemplate restTemplate = new RestTemplate();
        String url = apiUrl + uf;
        return restTemplate.getForObject(url, UfDetail.class);
    }
}
