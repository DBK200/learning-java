package com.sessions.session11.abstraction;

public interface UserProfile {

    //public static final fields
    //abstract methods

    int x = 2;
    public static final int y = 3;



    public abstract void getEmailAdress(); // abstract method
    void getUserPhoneNumber(); //  abstract method

    // default methods
    default String getUserAdress(){
        return "default address";
    }

}
