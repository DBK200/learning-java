package com.sessions.session9;

public class Animal {
    protected String name;
    protected int age;

    private String family;

    public Animal(String name, int age, String family){
        this.family = family;
        this.age = age;
        this.name = name;
    }
    public Animal(){

    }

    public Animal(String name, int age){

    }

    // Setter
    public void setName(String name){
        // this - pt referire la variabila de instanta a clasei curente, iar name de dupa egal este name-ul local
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }
}
