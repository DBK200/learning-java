package com.sessions.session25.practice.open_close_principle;

import static java.lang.Math.PI;
import static java.lang.Math.pow;


public abstract class Shape {
    abstract double calculateArea();
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return PI * pow(radius, radius);
    }
}


class TestShape {
    public static void main(String[] args) {
        Shape rct = new Rectangle(10, 20);
        System.out.println("Area: " + rct.calculateArea());

        Shape circle = new Circle(10);
        System.out.println("Area: " + circle.calculateArea());
    }
}