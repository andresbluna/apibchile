import com.example.apibchile.ApibchileApplication;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = ApibchileApplication.class)
public class ApiIntegrationTest {

    @Value("${local.server.port}")
    private int port;

    @BeforeEach
    public void setUp() {
        RestAssured.port = port;
    }

    @Test
    public void testGetIndicatorData() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/indicators")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("version", equalTo("1.7.0"))
                .body("autor", equalTo("mindicador.cl"))
                .body("uf.codigo", equalTo("uf"))
                .body("uf.nombre", equalTo("Unidad de fomento (UF)"))
                .body("uf.unidad_medida", equalTo("Pesos"))
                .body("uf.valor", equalTo(37366.7f));
    }

    @Test
    public void testGetUfDetail() {
        given()
                .contentType(ContentType.JSON)
                .when()
                .get("/uf")
                .then()
                .statusCode(HttpStatus.OK.value())
                .body("version", equalTo("1.7.0"))
                .body("autor", equalTo("mindicador.cl"))
                .body("codigo", equalTo("uf"))
                .body("nombre", equalTo("Unidad de fomento (UF)"))
                .body("serie[0].fecha", equalTo("2024-05-19T04:00:00.000Z"))
                .body("serie[0].valor", equalTo(37366.7f));
    }
}