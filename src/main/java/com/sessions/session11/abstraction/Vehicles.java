package com.sessions.session11.abstraction;

public abstract class Vehicles extends TransportationDv{

    //should not be used to create new objects
    //must be inherited

    public  abstract void startEngine();//cannot be final, private

//    Vehicles(){  can be defined with no arguments
//        System.out.println("inside constructor");
//    }

    public static void myMethod(){

    }

    public  void calculateSomething(){
        System.out.println("wef");
    }
}
