package com.sessions.session11.abstraction;

public interface UserProfiel {

    int x = 2;
    public static final int y=3;

    public abstract void getEmailAdress();
    void getUserPhoneNumber();

    default String getUserAdress() {
        return "default adress";
    }
}
