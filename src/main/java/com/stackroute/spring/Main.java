package com.stackroute.spring;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        creation of container
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movieActors = (Movie) context.getBean("movie");
        System.out.println(movieActors);
        context.close();
    }
}
