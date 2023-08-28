package com.example.Movie.Catalog.Service;


import com.example.Movie.Catalog.Model.Review;
import com.example.Movie.Catalog.Model.movie;
import com.example.Movie.Catalog.dao.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository ReviewRepo;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review CreateReview(String Body, String imdbId) {
        Review review = ReviewRepo.insert( new Review(Body));

        mongoTemplate.update(movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;

    }
}
