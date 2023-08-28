package com.example.Movie.Catalog.Service;

import com.example.Movie.Catalog.Model.movie;
import com.example.Movie.Catalog.dao.MovieRepository;
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

    public List<movie> allMovies() {
        System.out.println(movieRepo.findAll().size());
        return movieRepo.findAll();
    }

}
