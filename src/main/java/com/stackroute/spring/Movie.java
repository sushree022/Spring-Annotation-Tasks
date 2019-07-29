package com.stackroute.spring;

import java.util.List;

public class Movie {
    //    instance of Actor class created
    private List<Actor> actor;

    //    getters and setters
    public List<Actor> getActor() {
        return actor;
    }

    public void setActor(List<Actor> actor) {
        this.actor = actor;
    }

    //    to String method over
    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
