package com.sessions.session24.open_close_principle.after;

public class Circle extends Shape {
    private double radius;

    // Constructor and getters/setters for radius

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
