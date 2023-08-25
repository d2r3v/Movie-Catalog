package com.example.Movie.Catalog;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "movies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Movie {
    @Id
    private ObjectId objid;

    private String imdbId;
    private String title;
    private String ReleaseDate;
    private String trailerLink;
    private String Poster;
    private List<String> genre;
    private List<String> backdrops;

}
