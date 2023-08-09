package com.sessions.session11.abstraction;

public abstract class Vehicle extends Transportation{
    //should not be used to create new objects
    //must be inherited

    public abstract void startEngine();  //cannot be final, private

    public static void myMethod(){

    }

    //Vehicle() can be defined with no arguments

    public void calculateSomething(){
        System.out.println("wof");
    }

}
