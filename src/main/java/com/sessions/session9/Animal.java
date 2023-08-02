package com.sessions.session9;

import java.util.Date;

public class Animal {

    protected String name;
    protected int age;
    private String family;

    public Animal(String name, int age, String family){
        this.family=family;
        this.age=age;
        this.name=name;

    }

    public Animal(){

    }

    public Animal(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }


}

