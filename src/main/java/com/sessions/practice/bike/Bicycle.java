package com.sessions.practice.bike;

public class Bicycle {

    private int gear;
    private int speed;

    // All args constructor
    public Bicycle(int gear, int speed){
        this.gear = gear;
        this.speed = speed;
    }

    // Getters and setters
    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    // Methods
    public void applyBrake(int decrement) {
        speed = speed - decrement;
    }

    public void speedUp(int increment) {
        speed = speed + increment;
    }

    //method to print information about the bicycle
    public String toString() {
        return ("No of gears is " + gear + "\n" +
                " speed of bicycle is " + speed);
    }
}
