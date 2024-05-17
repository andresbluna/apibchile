package com.example.apibchile.model;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
public class IndicatorModel {

    private String codigo;
    private String nombre;
    private String unidad_medida;
    private Date fecha;
    private double valor;
}

