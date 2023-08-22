package com.sessions.practice.w3resourceaug20;

public class Person {

    // Properties / attributes
    private String name;
    private int age;

    // Parameterized constructor

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    // Getters and setters
    // Getters
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

}
