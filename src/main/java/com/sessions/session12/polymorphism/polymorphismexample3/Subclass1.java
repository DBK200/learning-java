package com.sessions.session12.polymorphism.polymorphismexample3;

public class Subclass1 extends Parent{

    public void print(){
        System.out.println("THIS IS FROM SUBCLASS 1");
    }

    public void calculateCircleArea(int radius){
        System.out.println("Circle area is " + Math.PI*Math.pow(radius, 2));
    }

    public void printSomethingFromS1(){
        System.out.println("This is from SUBLCASS 1 and it cannot be taken from SUBCLASS 2.\nRuntime polymorphism test");
    }
}
