package com.sessions.session11.abstraction;

public interface UserProfileDv {

    public abstract void getEmailAddress();//<-metoda abstracta
    void getUserPhoneNumber();// metoda abstracta

    //default methods
    default String getUserAddress(){
        return "default address";
    }


}
