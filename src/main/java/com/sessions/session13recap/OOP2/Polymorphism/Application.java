package com.sessions.session13recap.OOP2.Polymorphism;

import java.util.ArrayList;

public class Application {
    public static void main(String[] args) {

        ArrayList<Shape> shapeObjects = new ArrayList<>();

        Rectangle rectangle = new Rectangle(4, 7);
        Circle circle = new Circle(3);
        Triangle triangle = new Triangle(4,7,5);
        shapeObjects.add(rectangle);
        shapeObjects.add(circle);
        shapeObjects.add(triangle);

        for(Shape shape: shapeObjects) {
            System.out.println("Area for " + shape.getClass() + " " + shape.getArea());
        }
    }
}
