package com.example.apibchile.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class UfDetail {
    private String version;
    private String autor;
    private String codigo;
    private String nombre;
    private String unidadMedida;
    private List<UfSerieItem> serie;

    @Getter
    @Setter
    public static class UfSerieItem {
        private String fecha;
        private double valor;

    }

}