package com.sessions.session22.factory.Homework;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getSHape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getSHape("RECTANGLE");
        shape2.draw();

        Shape shape3 = shapeFactory.getSHape("SQUARE");
        shape3.draw();
    }
}
