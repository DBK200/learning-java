package com.sessions.session24.open_close_principle.after;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor and getters/setters for length and width

    @Override
    public double calculateArea() {
        return length * width;
    }
}
