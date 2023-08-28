package com.example.Movie.Catalog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@EnableMongoRepositories(basePackages = "com.example.Movie.Catalog.dao")
public class MovieCatalogApplication {

	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogApplication.class, args);
	}

	@GetMapping ("/test")
	public String apiRoot() {
		return "Hello world";
	}

	

	//mongoDB implementation removed from build.gradle temporarily
}
