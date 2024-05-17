package com.example.apibchile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class ApibchileApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApibchileApplication.class, args);
	}

}
