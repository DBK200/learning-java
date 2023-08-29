package com.sessions.recap.OOP.Abstraction;

public class Truck implements Vehicle{
    public void start(){
        System.out.println("The truck started");
    }
    public void stop(){
        System.out.println("The truck stopped");
    }
    public void accelerate(){
        System.out.println("The truck accelerated");
    }

}
