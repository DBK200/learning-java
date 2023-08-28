package com.sessions.session13recap.OOP2.Abstraction;

public class Car implements Vehicle {
    private int speed;
    public void start() {
        speed = 10;
    }
    public void stop() {
        speed = 0;
    }
    public void accelerate() {
        speed += 10;
    }
}
