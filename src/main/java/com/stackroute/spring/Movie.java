package com.stackroute.spring;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class Movie {
    @Autowired
    //    instance of Actor class created
    private List<Actor> actor;

    //    constructors
    public Movie(List<Actor> actor) {
        this.actor = actor;
    }

    public Movie() {
    }

    //    getters and setters
    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    //    to String method over ridden

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
