package com.sessions.recap.OOP.Abstraction;

public class Car implements Vehicle{

    public void start(){
        System.out.println("The car started");
    }
    public void stop(){
        System.out.println("The car stopped");
    }
    public void accelerate(){
        System.out.println("The car accelerated");
    }
}
