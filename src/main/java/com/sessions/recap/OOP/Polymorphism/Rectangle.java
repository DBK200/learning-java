package com.sessions.recap.OOP.Polymorphism;

public class Rectangle extends Shape{

    private double length;
    private double width;

    public Rectangle(double length, double width){
        this.length=length;
        this.width=width;
    }

    public void area(){
        System.out.println("Area= "+length*width);
    }

}