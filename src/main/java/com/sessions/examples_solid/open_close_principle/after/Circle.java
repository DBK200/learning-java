package com.sessions.examples_solid.open_close_principle.after;

public class Circle extends Shape {
    private double radius;
    Circle(double radius){
        this.radius = radius;
    }
    // Constructor and getters/setters for radius

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}
