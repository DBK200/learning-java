package com.sessions.session13recap.OOP1.Exercise3;

public class Car {
    private String name;
    private String model;
    private int year;
    private String color;

    public Car(String name, String model, int year, String color) {
        this.name = name;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public void startCar() {
        System.out.println("Car is starting...");
    }
    public void stopCar() {
        System.out.println("Car is stopping...");
    }
    public void accelerateCar() {
        System.out.println("Car is accelerating...");
    }
    public void brakeCar() {
        System.out.println("Car is braking...");
    }
}
