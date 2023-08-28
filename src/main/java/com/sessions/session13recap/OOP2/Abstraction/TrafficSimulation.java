package com.sessions.session13recap.OOP2.Abstraction;

public class TrafficSimulation {
    public static void main(String[] args) {

        Car car = new Car();
        Truck truck = new Truck();
        Motorcycle motorcycle = new Motorcycle();

        car.start();
        truck.start();
        car.accelerate();
        motorcycle.start();
        motorcycle.accelerate();
        car.stop();
        truck.accelerate();
        motorcycle.stop();
        truck.stop();

    }
}
