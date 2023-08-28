package com.sessions.session13recap.OOP2.Polymorphism;

public class Rectangle extends Shape {
    private int length;
    private int width;
    public Rectangle(int length, int width) {
        super();
        this.length = length;
        this.width = width;
    }
    @Override
    public double getArea() {
        return 2 * (double)(length + width);
    }
}
