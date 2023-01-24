package com.jap.restdemo.repository;

import com.jap.restdemo.domain.Movie;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieRepo extends CrudRepository<Movie,Integer> {
}
