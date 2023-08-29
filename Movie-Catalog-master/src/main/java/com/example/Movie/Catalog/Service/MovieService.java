package com.example.Movie.Catalog.Service;

import com.example.Movie.Catalog.Model.movie;
import com.example.Movie.Catalog.dao.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepo;

//    @Autowired
//    public MovieService(MovieRepository mvr) {
//        this.movieRepo = mvr;
//    }

    public List<movie> allMovies() {
        return movieRepo.findAll();
    }

    public Optional<movie> findMovie(String id){
        return movieRepo.findMovieByimdbId(id);
    }
}
