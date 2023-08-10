package com.sessions.session11.challenges.exercise4;

public abstract class Shape {
    abstract double rectangleArea(double length, double width);
    abstract double squareArea(double side);
    abstract double circleArea(double radius);
}

class Area extends Shape {

    @Override
    double rectangleArea(double length, double width) {
        return length * width;
    }

    @Override
    double squareArea(double side) {
        return Math.pow(side,2);
    }

    @Override
    double circleArea(double radius) {
        return Math.PI * Math.pow(radius,2);
    }
}

class Test {
    public static void main(String[] args) {
        double length = 10.0;
        double width = 20.5;
        double side = 5.5;
        double radius = 5.0;

        Area area = new Area();
        System.out.printf("Area of a rectangle with length: %1$2.1f and width: %2$2.1f is %5$.2f%n"
                        + "Area of a square with side: %3$2.1f is %6$.2f%n"
                        + "Area of a circle with radius: %4$2.1f is %7$.2f%n",
                length, width, side, radius,
                area.rectangleArea(length,width), area.squareArea(side), area.circleArea(radius));
    }
}

