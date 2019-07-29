package com.stackroute.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
//        creation of container
        ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);
        Movie movieActors1 = (Movie) context.getBean("movie1");
        System.out.println(movieActors1);
        Movie movieActors2 = (Movie) context.getBean("movie1");
        System.out.println(movieActors2);
        System.out.println(movieActors1 == movieActors2);
    }
}
