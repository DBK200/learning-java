package com.sessions.patternsPractice.creational.factory;

// Shape factory
class ShapeFactory {
    // Factory method to create shapes
    public Shape createShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("Rectangle")) {
            return new Rectangle();
        }
        return null;
    }
}

