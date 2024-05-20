package com.example.apibchile;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.info.Contact;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;


@OpenAPIDefinition(
		info = @Info(
				title = "Demo Api Rest BCHILE",
				version = "v1",
				description = "Documentación de la API REST BCHILE",
				contact = @Contact(email = "tu-email@example.com"),
				license = @License(name = "MIT", url = "https://opensource.org/licenses/MIT")
		)
)

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApibchileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApibchileApplication.class, args);
	}



}
