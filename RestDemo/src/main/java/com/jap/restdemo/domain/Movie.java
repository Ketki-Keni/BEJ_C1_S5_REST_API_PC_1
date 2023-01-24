/*
 * Author : Ketki Keni
 * Date : 24-01-2023
 * Created with : IntelliJ IDEA Community Edition
 */

package com.jap.restdemo.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Movie {
    @Id
    Integer movieId;
    String movieName;
    String actorName;
    String directorName;

    public Integer getMovieId() {
        return movieId;
    }

    public void setMovieId(Integer movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public String getActorName() {
        return actorName;
    }

    public void setActorName(String actorName) {
        this.actorName = actorName;
    }

    public String getDirectorName() {
        return directorName;
    }

    public void setDirectorName(String directorName) {
        this.directorName = directorName;
    }
}
