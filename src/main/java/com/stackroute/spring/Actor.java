package com.stackroute.spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Actor {
    //    declaration of variables
    private String name;
    private String gender;
    private int age;

    //    constructor
    @Autowired
    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public Actor() {

    }

    //    setters and getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //    toString over ridden
    @Override
    public String toString() {
        return "Actor{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }
}
