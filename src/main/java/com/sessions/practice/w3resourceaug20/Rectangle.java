package com.sessions.practice.w3resourceaug20;

public class Rectangle {

    // Properties / attributes
    private double width;
    private double height;

    // Getters and setters
    // Getters
    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    // Method to calculate area
    public double calculateRectangleArea(double width, double height){
        double area = width * height;
        area = Math.floor(area * 100) / 100;
        return area;
    }

    public double calculateRectanglePerimeter(double width, double height){
        double perimeter = 2 * width + 2* height;
        perimeter = Math.floor(perimeter * 100) / 100;
        return perimeter;
    }
}
