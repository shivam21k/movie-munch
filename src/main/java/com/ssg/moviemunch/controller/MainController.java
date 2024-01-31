package com.ssg.moviemunch.controller;

import com.ssg.moviemunch.models.MovieModel;
import com.ssg.moviemunch.service.MainService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@CrossOrigin
@RestController
@RequestMapping("/movies")
public class MainController {
    @Autowired
    private MainService mainService;
    @GetMapping(value = "/all")
    public ResponseEntity<List<MovieModel>> allMovies(){
        return new ResponseEntity<List<MovieModel>>(mainService.getAllMovies(), HttpStatus.OK);
    }
    @GetMapping(value = "/")
    public ResponseEntity<List<MovieModel>> movieByName(@RequestParam("movie-name") String seriesTitle ){
        return new ResponseEntity<List<MovieModel>>(mainService.getMovieBySeriesTitle(seriesTitle), HttpStatus.OK);
    }
}
