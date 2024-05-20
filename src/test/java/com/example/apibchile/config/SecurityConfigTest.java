package com.example.apibchile.config;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.cors.CorsConfigurationSource;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.security.test.web.servlet.setup.SecurityMockMvcConfigurers.springSecurity;

@SpringBootTest
@Import(SecurityConfig.class)
public class SecurityConfigTest {

    @Autowired
    private SecurityConfig securityConfig;

    @Autowired
    private WebApplicationContext context;

    @Test
    public void testFilterChain() throws Exception {
        HttpSecurity httpSecurity = MockMvcBuilders.webAppContextSetup(context).apply(springSecurity()).build().getDispatcherServlet().getWebApplicationContext().getBean(HttpSecurity.class);
        SecurityFilterChain filterChain = securityConfig.filterChain(httpSecurity);

        assertThat(filterChain).isNotNull();
    }

    @Test
    public void testCorsConfigurationSource() {
        CorsConfigurationSource corsConfigurationSource = securityConfig.corsConfigurationSource();

        assertThat(corsConfigurationSource).isNotNull();
    }
}