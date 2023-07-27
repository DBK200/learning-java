package com.sessions.session8;

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
}
