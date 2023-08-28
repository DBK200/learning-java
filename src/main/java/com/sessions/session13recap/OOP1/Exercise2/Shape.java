package com.sessions.session13recap.OOP1.Exercise2;

public class Shape {
    private String name;
    private int length;
    private int width;

    public Shape(String name, int length, int width) {
        this.name = name;
        this.length = length;
        this.width = width;
    }
    public int getPerimeter() {
        return length + width;
    }
    public int getArea() {
        return length * width;
    }
}
