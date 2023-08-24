package com.example.Movie.Catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class MovieCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);
	}

	@GetMapping
	public String apiRoot() {
		return "Hello world";
	}

	// spring.data.mongodb.uri = mongodb+srv://drv792:%23Googleabc12@cluster0.qfdr7ak.mongodb.net/
}
