package com.sessions.session11.AbstractTest;

public interface UserProfileRoxana {

    //public static final fiels
    //abstract methods
    //avantaj=ca se pot implementa mai multe interfete

    int x=2;
    public static final int y=3;

    public abstract void getEmailAddress();//metoda abstracta
    void getUserPhoneNumber();//metoda abstracta

    //default methods
    default String getUserAddress()
    {
        return "default address";
    }
}
