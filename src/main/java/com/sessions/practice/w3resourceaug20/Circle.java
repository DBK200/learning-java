package com.sessions.practice.w3resourceaug20;

public class Circle {

    // Attribute
    private double radius;

    // Getter and setter
    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    // Method to calculate the area of the circle
    public double calculateCircleArea(double radius){
        double area = Math.PI * Math.pow(radius, 2);
        area = Math.floor(area * 100) / 100;
        return area;
    }

    // Method to calculate the circumference of the circle
    public double calculateCircleCircumference(double radius){
        double circumference = 2 * Math.PI * radius;
        circumference = Math.floor(circumference * 100) / 100;
        return circumference;
    }

}
