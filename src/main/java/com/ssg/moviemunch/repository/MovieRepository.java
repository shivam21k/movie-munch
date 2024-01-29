package com.ssg.moviemunch.repository;
import com.ssg.moviemunch.models.MovieModel;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends MongoRepository<MovieModel, ObjectId>{
    List<MovieModel> findMovieBySeriesTitle(String seriesTitle);
}