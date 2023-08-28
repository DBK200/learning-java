package com.sessions.session13recap.OOP1.Exercise2;

public class Application {
    public static void main(String[] args) {

        Shape shape = new Shape("rectangle", 24,5);
        System.out.println("Perimeter: " + shape.getPerimeter());
        System.out.println("Area: " + shape.getArea());
    }
}
