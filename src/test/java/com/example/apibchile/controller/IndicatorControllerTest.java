package com.example.apibchile.controller;

import com.example.apibchile.model.IndicatorData;
import com.example.apibchile.model.UfDetail;
import com.example.apibchile.service.IndicatorService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.security.test.context.support.WithMockUser;
import org.springframework.test.web.servlet.MockMvc;

import java.util.Date;
import java.util.List;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.hamcrest.Matchers.is;

@WebMvcTest(IndicatorController.class)
public class IndicatorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private IndicatorService indicatorService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    @WithMockUser
    public void testGetIndicators() throws Exception {
        IndicatorData indicatorData = new IndicatorData();
        indicatorData.setVersion("1.0");
        indicatorData.setAutor("Autor");
        indicatorData.setFecha(new Date());
        IndicatorData.Indicator uf = new IndicatorData.Indicator();
        uf.setCodigo("UF");
        uf.setNombre("Unidad de Fomento");
        uf.setUnidad_medida("Pesos");
        uf.setFecha(new Date());
        uf.setValor(30000.0);
        indicatorData.setUf(uf);

        when(indicatorService.getIndicators()).thenReturn(indicatorData);

        mockMvc.perform(get("/indicators"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.version", is(indicatorData.getVersion())))
                .andExpect(jsonPath("$.autor", is(indicatorData.getAutor())))
                .andExpect(jsonPath("$.uf.codigo", is(indicatorData.getUf().getCodigo())))
                .andExpect(jsonPath("$.uf.nombre", is(indicatorData.getUf().getNombre())))
                .andExpect(jsonPath("$.uf.unidad_medida", is(indicatorData.getUf().getUnidad_medida())))
                .andExpect(jsonPath("$.uf.valor", is(indicatorData.getUf().getValor())));
    }

    @Test
    @WithMockUser
    public void testGetUfData() throws Exception {
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

        when(indicatorService.getUfData()).thenReturn(ufDetail);

        mockMvc.perform(get("/uf"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.version", is(ufDetail.getVersion())))
                .andExpect(jsonPath("$.autor", is(ufDetail.getAutor())))
                .andExpect(jsonPath("$.codigo", is(ufDetail.getCodigo())))
                .andExpect(jsonPath("$.nombre", is(ufDetail.getNombre())))
                .andExpect(jsonPath("$.unidadMedida", is(ufDetail.getUnidadMedida())))
                .andExpect(jsonPath("$.serie[0].fecha", is(serieItem.getFecha())))
                .andExpect(jsonPath("$.serie[0].valor", is(serieItem.getValor())));
    }
}