package com.sessions.session10.immutability;

public final class User {

    private final String NAME;

    public User(String NAME){
        this.NAME = NAME;
    }

    public String getName(){
        return NAME;
    }
}
