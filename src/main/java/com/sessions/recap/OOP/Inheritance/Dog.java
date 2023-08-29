package com.sessions.recap.OOP.Inheritance;

public class Dog extends Animal{

    private String breed;
    private double size;

    public void setName(String name){
        super.name=name;
    }


    public void bark(){
        System.out.println(name+" barked");
    }

    public void fetch(){
        System.out.println(name+" is fetching");
    }
}
