package com.sessions.session12.polymorphism.polymorphismexample2;

public class Subclass1 extends Parent{

    void print(){
        System.out.println("Subclass1");
    }

    void doSomething(){
        System.out.println("Parent can access the methods of subclass 1");
    }
}
