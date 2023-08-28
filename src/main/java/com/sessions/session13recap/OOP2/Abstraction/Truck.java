package com.sessions.session13recap.OOP2.Abstraction;

public class Truck implements Vehicle {
    private int speed;
    public void start() {
        speed = 5;
    }
    public void stop() {
        speed = 0;
    }
    public void accelerate() {
        speed += 5;
    }
}
