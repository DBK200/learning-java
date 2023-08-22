package com.sessions.practice.w3resourceaug20;

public class Dog {

    // Properties / attributes
    private String name;
    private String breed;

    // Constructor
    public Dog(String name, String breed){
        this.name = name;
        this.breed = breed;
    }

    // Getters and setters

    // Getters
    public String getName(){
        return name;
    }

    public String getBreed(){
        return breed;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setBreed(String breed){
        this.breed = breed;
    }
}
