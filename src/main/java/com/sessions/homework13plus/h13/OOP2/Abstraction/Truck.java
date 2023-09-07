package com.sessions.homework13plus.h13.OOP2.Abstraction;

public class Truck implements Vehicle{
    String truckMake;

    public Truck(String truckMake) {
        this.truckMake = truckMake;
    }

    @Override
    public void start() {
        System.out.println(this.truckMake + " slowly starts moving");
    }

    @Override
    public void stop() {
        System.out.println(this.truckMake + " has arrived at the destination and stops");
    }

    @Override
    public void accelerate() {
        System.out.println(this.truckMake + " slowly accelerates");
    }
}
