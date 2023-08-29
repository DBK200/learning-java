package com.sessions.recap.OOP.Polymorphism;

public class Triangle extends Shape{

    private double base;
    private double height;

    public Triangle(double base,double height){
        this.base=base;
        this.height=height;
    }

    public void area(){
        System.out.println("Area= "+base*height*0.5);
    }
}
