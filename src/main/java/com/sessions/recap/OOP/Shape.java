package com.sessions.recap.OOP;

public class Shape {

//    Shape: Create a Shape class that has the following attributes: shape name, length, and width.
//    Implement methods for calculating the area and perimeter of the shape.

    private double length;
    private double width;

    public Shape(double length, double width){
        this.length=length;
        this.width=width;
    }

    public double area(){
        return length*width;
    }

    public double perimeter(){
        return (length+width)*2;
    }

}
