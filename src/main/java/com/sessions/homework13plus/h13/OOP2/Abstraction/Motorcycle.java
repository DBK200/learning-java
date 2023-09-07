package com.sessions.homework13plus.h13.OOP2.Abstraction;

public class Motorcycle implements Vehicle{
    String type;

    public Motorcycle(String type) {
        this.type = type;
    }

    @Override
    public void start() {
        System.out.println(this.type + " starts moving through the between");
    }

    @Override
    public void stop() {
        System.out.println(this.type + " stops so the truck can pass");
    }

    @Override
    public void accelerate() {
        System.out.println(this.type + " accelerates into the horizon");

    }
}
