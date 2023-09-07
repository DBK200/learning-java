package com.sessions.homework13plus.h13.OOP1;

public class Car {
    //Car: Create a Car class that has the following attributes: make, model, year, and color. Implement methods for starting
    //the car, stopping the car, accelerating, and braking.
    String make, model, color;
    int year;

    public Car(String make, String model, String color, int year) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
    }

    public static void main(String[] args) {
        Supra supra = new Supra("Toyota", "Supra", "orange", 2004);
        supra.startCar();
        supra.accelerate();
        supra.brake();
    }

    void startCar() {
        System.out.println("Starting car...");
        System.out.println("Vrooom ! ! ");
        System.out.println("Drive Safely");
    }

    void accelerate() {
        System.out.println("Increasing velocity !");
    }

    void brake() {
        System.out.println("Braking...");
    }
}
