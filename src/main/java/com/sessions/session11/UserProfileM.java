package com.sessions.session11;

public interface UserProfileM {

    // public static final fields
    // abstract methods
     int x = 2;
    public static final int y = 3;

    public abstract void getEmailAddress(); // < = metoda abstracta
    void getUserPhoneNumber(); // metoda abstracta

    //default methods
    default String getUserAddress(){
        return "default address";
    }

}
