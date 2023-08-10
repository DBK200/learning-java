package com.sessions.session11.abstraction;

public abstract class Vehicle extends Transportation {
    //should not be used to create mew objects
    // must be inherited (trebuie sa fie mostenita)

    public abstract void startEngine();// < = metoda abstracta, cannot be final, private

//    Vehicle(){ can be defined with no arguments
//        System.out.println("inside constructor");
//    }
    public static void myMethod(){

    }
    public void calculateSomething(){
        System.out.println("wef");
    }
}
