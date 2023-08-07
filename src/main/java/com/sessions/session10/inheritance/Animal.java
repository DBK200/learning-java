package com.sessions.session10.inheritance;

public class Animal {

    //name, age, color, specie... -> proprietati
    //eat, sleep, makesound... -> methods/"functions"

    protected static String specie;
    public int age;

    protected void eat(){
        System.out.println("Animal is eating something good...");
    }
}
