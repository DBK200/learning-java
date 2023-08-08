package com.sessions.session10.Imutabillity;

public final class UserDavid {
    //Imutable=> won't change

    private final String name;

    public UserDavid(String name)
    {
        this.name=name;
    }

    public String getName(){
        return name;
    }
}
