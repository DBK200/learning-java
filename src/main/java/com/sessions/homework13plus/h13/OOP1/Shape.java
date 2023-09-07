package com.sessions.homework13plus.h13.OOP1;

public class Shape {
    //Scenario : Shape: Create a Shape class that has the following attributes: shape name, length, and width. Implement methods for
    //calculating the area and perimeter of the shape.
    String shapeName;
    double length, width;

    public Shape(String shapeName, double length, double width) {
        this.shapeName = shapeName;
        this.length = length;
        this.width = width;
    }

    public static void main(String[] args) {
        Shape shape1 = new Shape("forma mea", 13,15);
        shape1.calculateArea();
        shape1.calculatePerimeter();
    }

    private double calculateArea(){
        double area = this.length*this.width;
        System.out.println("The area is equal to " + area);
        return area;
    }

    private double calculatePerimeter(){
        double perimeter = this.length*2 + this.width*2;
        System.out.println("The perimeter is equal to " + perimeter);
        return perimeter;
    }

}
