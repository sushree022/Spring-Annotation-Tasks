package com.stackroute.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class MovieConfig {
    //    set details of first actor
    @Bean(name = "actor1")
    public Actor movieActor1() {
        Actor actor1 = new Actor();
        actor1.setName("Sahrukh");
        actor1.setGender("Male");
        actor1.setAge(50);
        return actor1;
    }

    //    set details of second actor
    @Bean(name = "actor2")
    public Actor movieActor2() {
        Actor actor2 = new Actor();
        actor2.setName("Alia");
        actor2.setGender("Female");
        actor2.setAge(25);
        return actor2;
    }

    //    creation of movie bean
    @Bean(name = "movie")
    public Movie movie1() {
        Movie newMovie = new Movie();
        List<Actor> actorList = new ArrayList<>();
        actorList.add(movieActor1());
        actorList.add(movieActor2());
        newMovie.setActor(actorList);
        return newMovie;
    }
}
