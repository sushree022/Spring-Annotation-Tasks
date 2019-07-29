package com.stackroute.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        creation of container
        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movieActors = (Movie) context.getBean("movie");
        System.out.println(movieActors);
    }
}
