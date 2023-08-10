package com.sessions.session10.immutabillity;

public final class User{
    //Immutable = > wont't change

    private final String name;

    public User(String name){
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
