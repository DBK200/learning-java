package com.sessions.session11.abstraction.Homework.Homework4;

public class Area extends Shape{


    @Override
    int rectangleArea(int length, int breadth) {
        return length * breadth;
    }

    @Override
    int squareArea(int side) {
        return side * side;

    }

    @Override
    double circleArea(int radius) {
        return Math.PI * (radius * radius);

    }
}
