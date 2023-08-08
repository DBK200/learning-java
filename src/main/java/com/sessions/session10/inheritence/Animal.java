package com.sessions.session10.inheritence;

public class Animal {

    //name, age, color, specie... -> propreite
    // eat, sleep, makesound... -> methods/"functions"

    protected static String specie;
    public int age =2;

    protected void eat(String x){
        System.out.println("Animal is eating something good..");
    }

}
