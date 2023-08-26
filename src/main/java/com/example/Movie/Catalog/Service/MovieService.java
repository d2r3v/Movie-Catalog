package com.example.Movie.Catalog.Service;

import com.example.Movie.Catalog.Model.Movie;
import com.example.Movie.Catalog.dao.MovieRepository;
import jakarta.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

//    @Autowired
//    public MovieService(MovieRepository mvr) {
//        this.movieRepo = mvr;
//    }

    public List<Movie> allMovies() {
        return movieRepo.findAll();
    }

}
