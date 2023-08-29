package com.sessions.recap.OOP.Polymorphism;

public class Circle extends Shape{

    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void area(){
        final double pi=3.14;
        System.out.println("Area= "+Math.pow(radius,2)*pi);
    }
}
