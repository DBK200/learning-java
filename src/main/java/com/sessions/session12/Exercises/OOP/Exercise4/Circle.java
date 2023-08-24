package com.sessions.session12.Exercises.OOP.Exercise4;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double aria(){
        final double pi=3.14;
        return Math.pow(radius,2)*pi;
    }
    public double circumference(){
       final double pi=3.14;
       return 2*pi*radius;
    }

}
