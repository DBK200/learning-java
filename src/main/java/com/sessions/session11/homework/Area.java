package com.sessions.session11.homework;

public class Area extends Shape{

    @Override
    public void rectangleArea(int length, int breadth) {
        System.out.println("Rectangle area is: " + length * breadth );
    }

    @Override
    public void circleArea(int radius) {
        System.out.println("Circle area is: " + (radius * radius * 3.14D));
    }

    @Override
    public void squareArea(int side) {
        System.out.println("Square area is: " + side * side );
    }
}
