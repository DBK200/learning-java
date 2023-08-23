package com.sessions.session12.polymorphims;



public class Student extends User {

    private String name = "Alex";

    public String getName(){
        return name;
    }

    Student(){
        name = "John";
    }
}
