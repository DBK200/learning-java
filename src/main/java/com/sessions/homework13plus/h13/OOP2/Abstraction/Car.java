package com.sessions.homework13plus.h13.OOP2.Abstraction;

public class Car implements Vehicle{
    String make, model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    @Override
    public void start() {
        System.out.println(this.make + this.model + " starts the car engine");
    }

    @Override
    public void stop() {
        System.out.println(this.make + this.model + " breaks to a stop");

    }

    @Override
    public void accelerate() {
        System.out.println(this.make + this.model + " is trying to overtake");

    }
}
