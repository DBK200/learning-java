package com.sessions.examples_solid.open_close_principle.after;

public class Square extends Shape {
    private double side;

    // Constructor and getters/setters for side

    @Override
    public double calculateArea() {
        return side * side;
    }
}
