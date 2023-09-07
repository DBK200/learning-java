package com.sessions.homework13plus.h13.OOP2.Abstraction;

public class Traffic {
    public static void main(String[] args) {
        Motorcycle motorcycle = new Motorcycle("Cruiser");
        Truck truck = new Truck("Scania");
        Car car = new Car("Alpha Romeo", " Giulia");
        motorcycle.start();
        car.start();
        truck.start();
        car.accelerate();
        motorcycle.stop();
        truck.accelerate();
        car.stop();
        motorcycle.accelerate();
        truck.stop();


    }
}
