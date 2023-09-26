package com.sessions.patternsPractice.creational.factory;

public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();

        // Create a Circle
        Shape circle = factory.createShape("Circle");
        circle.draw();

        // Create a Rectangle
        Shape rectangle = factory.createShape("Rectangle");
        rectangle.draw();
    }
}
