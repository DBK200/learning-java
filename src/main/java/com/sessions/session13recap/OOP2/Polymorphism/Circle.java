package com.sessions.session13recap.OOP2.Polymorphism;
public class Circle extends Shape {
    private int radius;
    public Circle(int radius) {
        super();
        this.radius = radius;
    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }
}
