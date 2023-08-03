package com.sessions.session10.practice.inheritence;

public class Animal {
    // name, age, color, species -> properties
    // eats, sleeps, makesNoise -> method

    protected static String species;
    public int age = 2;

    protected void eat() {
        //System.out.println(getClass().getSimpleName() + " eats something good!");
        System.out.println("ANIMAL eats something good!");
    }


}
