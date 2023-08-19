package com.sessions.session11.abstraction.HomeworkAV.challenge4;

public class Area extends Shape {
    @Override
    public int rectangleArea(int length, int breadth) {
        return length + breadth;
    }

    @Override
    public int squareArea(int side) {
        return side * side;
    }

    @Override
    public double circleArea(int radius) {
        return radius * radius * Math.PI;
    }
}
