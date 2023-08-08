package com.sessions.session10.Immutabillity;

public class UserRoxana
{
    //Inmutable=nu se schimba
    private final String name;
    public UserRoxana(String name)
    {
        this.name=name;
    }

    public String getName()
    {
        return name;
    }
}
