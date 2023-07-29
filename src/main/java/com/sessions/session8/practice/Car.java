package com.sessions.session8.practice;

public class Car {
    private int wheels;
    private String paintColour;
    private String fuel;

    public Car (int wheels, String paintColour, String fuel) {
        this.wheels = wheels;
        this.paintColour = paintColour;
        this.fuel = fuel;
    }
    public String getPaintColour() {
        return this.paintColour;
    }

    // This method is accessible only to its child classes
    protected int getWheels() {
        return this.wheels;
    }

    // This method can't be accessed outside this class
    private void privateMethod() {
        System.out.println("This method can't be access from outside.");
    }
}
