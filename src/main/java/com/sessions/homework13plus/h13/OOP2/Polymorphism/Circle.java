package com.sessions.homework13plus.h13.OOP2.Polymorphism;

public class Circle extends Shape{
    int r;

    public Circle(String name, int r) {
        super(name);
        this.r = r;
    }

    public Circle(String name) {
        super(name);
    }

    @Override
    public double Area() {

        return r*r;
    }
}
