package com.sessions.session11.abstraction.HomeworkSession11ex4;

public class Area extends Shape{

    // Implement the 3 abstract methods from the abstract class Shape
    @Override
    public double rectangleArea(double length, double breadth) {
        double area = length * breadth;
        area = Math.floor(area * 100) / 100;
        return area;
    }

    @Override
    public double squareArea(double side) {
        double area = Math.pow(side, 2);
        area = Math.floor(area * 100) / 100;
        return area;
    }

    @Override
    public double circleArea(double radius) {
        double area = Math.PI * Math.pow(radius, 2);
        area = Math.floor(area * 100) / 100;
        return area;

    }



}
