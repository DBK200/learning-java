package com.sessions.session11.abstraction;

public abstract class Vehicle {
    // should not be used to create new objects
    // must be inherited

    public abstract void startEngine();
         // cannot be final, private

    public static void myMethod(){
    }

    public void calculateSomething(){
        System.out.println("wef");
    }

}
