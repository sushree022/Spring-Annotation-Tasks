package com.stackroute.spring;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.List;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {
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

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("Bean factory is set: " + beanFactory);

    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Bean Name is set: " + s);

    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Application context is set: " + applicationContext);

    }
    //    to String method over ridden

    @Override
    public String toString() {
        return "Movie{" +
                "actor=" + actor +
                '}';
    }
}
