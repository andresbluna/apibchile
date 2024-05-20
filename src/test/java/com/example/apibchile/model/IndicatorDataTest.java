package com.example.apibchile.model;

import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class IndicatorDataTest {

    @Test
    public void testIndicatorDataGettersAndSetters() {
        IndicatorData indicatorData = new IndicatorData();
        Date now = new Date();

        indicatorData.setVersion("1.0");
        indicatorData.setAutor("Autor");
        indicatorData.setFecha(now);

        IndicatorData.Indicator uf = new IndicatorData.Indicator();
        uf.setCodigo("UF");
        uf.setNombre("Unidad de Fomento");
        uf.setUnidad_medida("Pesos");
        uf.setFecha(now);
        uf.setValor(30000.0);

        indicatorData.setUf(uf);

        assertEquals("1.0", indicatorData.getVersion());
        assertEquals("Autor", indicatorData.getAutor());
        assertEquals(now, indicatorData.getFecha());
        assertNotNull(indicatorData.getUf());
        assertEquals("UF", indicatorData.getUf().getCodigo());
        assertEquals("Unidad de Fomento", indicatorData.getUf().getNombre());
        assertEquals("Pesos", indicatorData.getUf().getUnidad_medida());
        assertEquals(now, indicatorData.getUf().getFecha());
        assertEquals(30000.0, indicatorData.getUf().getValor());
    }

    @Test
    public void testIndicatorGettersAndSetters() {
        IndicatorData.Indicator indicator = new IndicatorData.Indicator();
        Date now = new Date();

        indicator.setCodigo("USD");
        indicator.setNombre("Dólar");
        indicator.setUnidad_medida("Pesos");
        indicator.setFecha(now);
        indicator.setValor(800.0);

        assertEquals("USD", indicator.getCodigo());
        assertEquals("Dólar", indicator.getNombre());
        assertEquals("Pesos", indicator.getUnidad_medida());
        assertEquals(now, indicator.getFecha());
        assertEquals(800.0, indicator.getValor());
    }
}