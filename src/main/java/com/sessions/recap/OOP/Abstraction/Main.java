package com.sessions.recap.OOP.Abstraction;

public class Main {

//    Create an interface Vehicle with methods such as start(), stop(), and accelerate().
//    Create classes such as Car, Truck, and Motorcycle that implement the Vehicle interface,
//    and implement the methods differently. Use these classes to create a traffic simulation
//    that simulates different types of vehicles on a road.

    public static void main(String[] args) {

        Car car=new Car();
        Motorcycle motorcycle=new Motorcycle();
        Truck truck=new Truck();

        car.stop();
        motorcycle.accelerate();
        truck.start();
        motorcycle.stop();
        car.start();
        car.accelerate();
        truck.accelerate();
        truck.stop();

    }

}
