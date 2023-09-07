package com.sessions.homework13plus.h13.OOP2.Polymorphism;

public class Rectangle extends Shape{
    int length, width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name) {
        super(name);
    }

    @Override
    public double Area() {
        return this.length*this.width;
    }
}
