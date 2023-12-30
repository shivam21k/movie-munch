package com.ssg.moviemunch.models;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Map;
import lombok.Data;

@Document(collection = "SampleData")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MovieModel {
    @Id
    private ObjectId id;
    private String posterLink;
    private String title;
    private String releasedYear;
    private String certificate;
    private String runtime;
    private String genre;
    private Float imdbRating;
    private String overview;
    private Float metaScore;
    private String director;
    private String starOne;
    private String starTwo;
    private String starThree;
    private String starFour;
    private Integer numberOfVotes;
    private String gross;
}
