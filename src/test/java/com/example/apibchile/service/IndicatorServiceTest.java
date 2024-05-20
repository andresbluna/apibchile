package com.example.apibchile.service;

import com.example.apibchile.model.IndicatorData;
import com.example.apibchile.model.UfDetail;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.when;

public class IndicatorServiceTest {

    @Mock
    private RestTemplate restTemplate;

    @InjectMocks
    private IndicatorService indicatorService;

    @Value("${mindicador.api.url}")
    private String apiUrl = "http://miindicador.cl/api";

    @Value("${mindicador.api.uf}")
    private String uf = "/uf";

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        indicatorService = new IndicatorService(apiUrl, uf);
    }

    @Test
    void testGetIndicators() {
        IndicatorData mockIndicatorData = new IndicatorData();

        when(restTemplate.getForObject(eq(apiUrl), eq(IndicatorData.class))).thenReturn(mockIndicatorData);

        IndicatorData result = indicatorService.getIndicators();

        assertEquals(mockIndicatorData, result);
    }

    @Test
    void testGetUfData() {
        UfDetail mockUfDetail = new UfDetail();

        String url = apiUrl + uf;
        when(restTemplate.getForObject(eq(url), eq(UfDetail.class))).thenReturn(mockUfDetail);

        UfDetail result = indicatorService.getUfData();

        assertEquals(mockUfDetail, result);
    }
}