package com.sessions.session11.abstraction;

public abstract class Vehicle {
    //should not be used to create new objects
    //must be inherited

    public abstract void startEngine();

    private void myMethod(){
        //some code
    }
    public void calculateSomething(){
        System.out.println("wrumm");
    }
}
