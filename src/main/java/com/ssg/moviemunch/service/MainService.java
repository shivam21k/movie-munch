package com.ssg.moviemunch.service;

import com.ssg.moviemunch.models.MovieModel;
import com.ssg.moviemunch.repository.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
@Service
public class MainService {
    @Autowired//letting framework know to instantiate the class below for us.
    private MovieRepository movieRepository;
    public List<MovieModel> getAllMovies(){
        return movieRepository.findAll();
    }
}
