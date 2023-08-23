package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex16;

import com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex8.TrafficLight;

public class Triangle extends Shape{

    private double Side1;
    private double Side2;
    private double base;
    private double height;

    public Triangle(double side1, double side2, double base, double height){
        this.Side1 = side1;
        this.Side2 = side2;
        this.base = base;
        this.height = height;
    }


    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return Side1 + Side2 + base;
    }
}
