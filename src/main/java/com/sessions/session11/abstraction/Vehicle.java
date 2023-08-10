package com.sessions.session11.abstraction;

public abstract class Vehicle extends Transportation {

    public abstract void startEngine();

    public static void myMethod(){
    }

    public void calculateSomething(){
        System.out.println("wef");
    }

    Vehicle(){
        System.out.println("inside constructor");
    }
}
