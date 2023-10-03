package com.sessions.session24.open_close_principle.after;

public class Square extends Shape {
    private double side;

    // Constructor and getters/setters for side

    @Override
    public double calculateArea() {
        return side * side;
    }
}
