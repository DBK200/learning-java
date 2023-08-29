package com.sessions.session13recap.oop;

public class Shape {
    // 2. Shape: Create a Shape class that has the following attributes:
    // shape name, length, and width. Implement methods for calculating
    // the area and perimeter of the shape.

    // Attributes
    private String name;
    private int length;
    private int width;

    // All args constructor
    public Shape(String name, int length, int width){
        this.name = name;
        this.length = length;
        this.width = width;
    }

    // Getters and setters
    // Getters
    public String getName(){
        return name;
    }

    public int getLength(){
        return length;
    }

    public int getWidth(){
        return width;
    }

    // Setters
    public void setName(String name){
        this.name = name;
    }

    public void setLength(int length){
        this.length = length;
    }

    public void setWidth(int width){
        this.width = width;
    }

    // Method to calculate the perimeter of the shape
    public int calculatePerimeter(int length, int width){
        int perim = 2*(length + width);
        return perim;
    }

    // Method to calculate the area of the shape
    public int calculateArea(int length, int width){
        int area = length * width;
        return area;
    }
}
