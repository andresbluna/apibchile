package com.example.apibchile.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Map;

@Getter
@Setter
public class IndicatorData {
    private String version;
    private String autor;
    private Date fecha;
    private Indicator uf;
    private Indicator ivp;
    private Indicator dolar;
    private Indicator dolar_intercambio;
    private Indicator euro;
    private Indicator ipc;
    private Indicator utm;
    private Indicator imacec;
    private Indicator tpm;
    private Indicator libra_cobre;
    private Indicator tasa_desempleo;
    private Indicator bitcoin;

    @Getter
    @Setter
    public static class Indicator {
        private String codigo;
        private String nombre;
        private String unidad_medida;
        private Date fecha;
        private double valor;
    }
}
