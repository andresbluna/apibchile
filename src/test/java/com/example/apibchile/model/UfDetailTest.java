package com.example.apibchile.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class UfDetailTest {

    @Test
    public void testUfDetailGettersAndSetters() {
        UfDetail ufDetail = new UfDetail();

        ufDetail.setVersion("1.0");
        ufDetail.setAutor("Autor");
        ufDetail.setCodigo("UF");
        ufDetail.setNombre("Unidad de Fomento");
        ufDetail.setUnidadMedida("Pesos");

        UfDetail.UfSerieItem serieItem = new UfDetail.UfSerieItem();
        serieItem.setFecha("2023-01-01");
        serieItem.setValor(30000.0);

        ufDetail.setSerie(List.of(serieItem));

        assertEquals("1.0", ufDetail.getVersion());
        assertEquals("Autor", ufDetail.getAutor());
        assertEquals("UF", ufDetail.getCodigo());
        assertEquals("Unidad de Fomento", ufDetail.getNombre());
        assertEquals("Pesos", ufDetail.getUnidadMedida());
        assertNotNull(ufDetail.getSerie());
        assertEquals(1, ufDetail.getSerie().size());
        assertEquals("2023-01-01", ufDetail.getSerie().get(0).getFecha());
        assertEquals(30000.0, ufDetail.getSerie().get(0).getValor());
    }

    @Test
    public void testUfSerieItemGettersAndSetters() {
        UfDetail.UfSerieItem serieItem = new UfDetail.UfSerieItem();

        serieItem.setFecha("2023-01-01");
        serieItem.setValor(30000.0);

        assertEquals("2023-01-01", serieItem.getFecha());
        assertEquals(30000.0, serieItem.getValor());
    }
}