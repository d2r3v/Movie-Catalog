package com.example.Movie.Catalog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {

    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();

        // Set the allowed origin, methods, and headers
        config.addAllowedOrigin("http://localhost:3000");
        config.addAllowedMethod("*"); // Allow all HTTP methods
        config.addAllowedHeader("Content-Type");

        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
