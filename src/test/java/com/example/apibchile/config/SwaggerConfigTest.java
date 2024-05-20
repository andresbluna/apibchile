package com.example.apibchile.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.security.SecurityScheme;
import org.junit.jupiter.api.Test;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@Import(SwaggerConfig.class)
class SwaggerConfigTest {

    @Autowired
    private SwaggerConfig swaggerConfig;

    @Test
    public void testPublicApi() {
        GroupedOpenApi groupedOpenApi = swaggerConfig.publicApi();

        assertThat(groupedOpenApi).isNotNull();
        assertThat(groupedOpenApi.getGroup()).isEqualTo("public-apis");
        assertThat(groupedOpenApi.getPathsToMatch()).containsExactly("/**");
    }

    @Test
    public void testCustomOpenApi() {
        OpenAPI openAPI = swaggerConfig.customOpenApi();

        assertThat(openAPI).isNotNull();
        assertThat(openAPI.getInfo().getTitle()).isEqualTo("Api title");
        assertThat(openAPI.getInfo().getVersion()).isEqualTo("API version");
        assertThat(openAPI.getComponents().getSecuritySchemes()).containsKey("bearerAuth");
        assertThat(openAPI.getComponents().getSecuritySchemes().get("bearerAuth").getType()).
                isEqualTo(SecurityScheme.Type.HTTP);
        assertThat(openAPI.getComponents().getSecuritySchemes().get("bearerAuth").getScheme())
                .isEqualTo("bearer");
        assertThat(openAPI.getComponents().getSecuritySchemes().get("bearerAuth")
                .getBearerFormat()).isEqualTo("JWT");
    }
}