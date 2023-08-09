package com.sessions.session10.immutability;

public class User {
    //Immutable = won't change

    private final String name ;

    public User(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}
