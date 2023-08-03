package com.sessions.session9;

public class Animal1 {
    protected String name;
    protected int age;
    private String family;

    public Animal1(String family, int age, String name){
        this.name = name;
        this.age = age;
        this.family = family;

    }
    public Animal1(){

    }
    public Animal1(String name, int age){
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age){
        this.age = age;
    }
}
