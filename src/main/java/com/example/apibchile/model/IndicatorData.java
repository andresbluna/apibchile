package com.example.apibchile.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Map;

@Getter
@Setter
public class IndicatorData {
    private String version;
    private String autor;
    private LocalDateTime fecha;
    private Map<String, IndicatorModel> series;
}
