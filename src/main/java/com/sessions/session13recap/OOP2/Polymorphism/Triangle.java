package com.sessions.session13recap.OOP2.Polymorphism;

public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;
    public Triangle(int side1, int side2, int side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    @Override
    public double getArea(){
        return (double)side1 + side2 + side3;
    }
}
