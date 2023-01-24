/*
 * Author : Ketki Keni
 * Date : 24-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.jap.restdemo.controller;

import com.jap.restdemo.domain.Movie;
import com.jap.restdemo.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class MovieController {
    MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) {
        this.movieService = movieService;
    }

    @PostMapping("/movie")
    public ResponseEntity<?> insertMovie(@RequestBody Movie movie){
        return new ResponseEntity<Movie>(movieService.addMovie(movie), HttpStatus.OK);
    }

    @GetMapping("/movies")
    public ResponseEntity<?> getAllProducts(){
        return new ResponseEntity<List<Movie>>(movieService.getAllMovies(),HttpStatus.OK);
    }
}
