package com.sessions.session10.immutability;

public final class UserM {
    //Immutable = > won't change

    private final String name;

    public UserM(String name) {
        this.name = name;
    }
    public String getName(){
        return name;
    }
}
