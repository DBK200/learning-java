package com.sessions.session10.inheritanceAV;

public class AnimalAV {

    //name, age, color, specie... -> proprietati
    //eat, sleep, makesounds... ->methods/"functions"

    protected static String specie;
    public int age = 2;

    protected void eat(String x) {
        System.out.println("Animal is eating something good...");
    }

}
