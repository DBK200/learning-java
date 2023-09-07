package com.sessions.homework13plus.h13.OOP2.Polymorphism;

public class Triangle extends Shape{
    int cat, h;

    public Triangle(String name, int cat, int h) {
        super(name);
        this.cat = cat;
        this.h = h;
    }

    public Triangle(String name) {
        super(name);
    }

    @Override
    public double Area() {

        return this.cat*this.h/2;
    }
}
