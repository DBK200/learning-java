package com.sessions.session1;

public class Tractor {
    // instance variables.
    // Can't be access directly from outside,
    // but can be access by calling
    // getter-setter methods
    private String make;
    private int wheels;
    private String traction;
    private double speed;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public String getTraction() {
        return traction;
    }

    public void setTraction(String traction) {
        this.traction = switch (traction.toUpperCase().charAt(0)) {
                            case 'F' -> "Front-Wheel Drive";
                            case 'A' -> "All-Wheel Drive";
                            default -> "Rear-Wheel Drive";
                        };
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        // local variable
        double dTempSpeed = (speed > 0) ? speed : 0d;
        this.speed = dTempSpeed;
    }

    public void printClass() {
        System.out.printf("[%s] %s has %d wheels, %s and runs with %.1f km/h.%n",
                this.getClass().getSimpleName(), make ,wheels, traction, speed);
    }

}
