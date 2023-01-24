/*
 * Author : Ketki Keni
 * Date : 24-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.jap.restdemo.service;

import com.jap.restdemo.domain.Movie;
import com.jap.restdemo.service.MovieService;
import com.jap.restdemo.repository.MovieRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieServiceImpl implements MovieService{
    MovieRepo movieRepo;
    @Autowired
    public MovieServiceImpl(MovieRepo movieRepo) {
        this.movieRepo = movieRepo;
    }

    @Override
    public Movie addMovie(Movie movie) {
        return movieRepo.save(movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        List<Movie> movieList=new ArrayList<Movie>();
        movieRepo.findAll().forEach(movieList::add);
        return movieList;
    }
}
