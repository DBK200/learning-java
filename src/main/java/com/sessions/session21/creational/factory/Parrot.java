package com.sessions.session21.creational.factory;

public class Parrot implements Bird {

    @Override
    public void fly(){
        System.out.println("Parrot is flying");
    }

    public void talking(){
        System.out.println("Parrot is talking");
    }
}
