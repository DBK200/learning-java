package com.sessions.homework13plus.h13.OOP2.Abstraction;

public interface Vehicle {
    //Abstraction:
    //Create an interface Vehicle with methods such as start(), stop(), and accelerate(). Create classes such as
    //Car, Truck, and Motorcycle that implement the Vehicle interface, and implement the methods differently.
    //Use these classes to create a traffic simulation that simulates different types of vehicles on a road.

    public abstract void start();
    public abstract void stop();
    public abstract void accelerate();

}
