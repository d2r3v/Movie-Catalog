package com.example.Movie.Catalog.api;

import com.example.Movie.Catalog.Model.movie;
import com.example.Movie.Catalog.Service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

//    @Autowired
//    public MovieController(MovieService movieService) {
//        this.movieService = movieService;
//    }

    @GetMapping
    public ResponseEntity<List<movie>> getallMovies() {
        System.out.println(movieService.allMovies().size());
        return new ResponseEntity<List<movie>>(movieService.allMovies(), HttpStatus.OK);

    }
}
