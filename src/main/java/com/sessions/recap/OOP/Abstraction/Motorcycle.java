package com.sessions.recap.OOP.Abstraction;

public class Motorcycle implements Vehicle{

    public void start(){
        System.out.println("The motorcycle started");
    }
    public void stop(){
        System.out.println("The motorcycle stopped");
    }
    public void accelerate(){
        System.out.println("The motorcycle accelerated");
    }
}
