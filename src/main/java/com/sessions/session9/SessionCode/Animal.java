package com.sessions.session9.SessionCode;

public class Animal {

    protected  String name;
    protected int age;

    private String family;

    public Animal(){

    }

    public Animal(String name, int age){
            this.name=name;
            this.age=age;
    }

    public Animal(String name, int age,String family){
        this.name=name;
        this.age=age;
        this.family=family;
    }

    public void setName(String name){
        this.name=name;
    }

    public void setAge(int age){
        this.age=age;
    }
}
