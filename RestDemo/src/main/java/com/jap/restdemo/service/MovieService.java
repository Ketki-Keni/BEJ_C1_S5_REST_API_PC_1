package com.jap.restdemo.service;

import com.jap.restdemo.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService{
    public Movie addMovie(Movie movie);
    public List<Movie> getAllMovies();
}
