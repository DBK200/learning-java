package com.sessions.session11.Homework.Exercise4;

public class AreaM extends ShapeM {

    public int rectangleArea(int length, int width) {
        //Area of a rectangle = length × width
        length = 35;
        width = 25;
        return length * width;
    }

    public int squareArea(int x) {
        //A=a2
        x = 5;
        return x * 5;
    }

    public double circleArea(double area) {
        //Area = pi * r^2
        double radius = 8 / 2; //raza cercului se imparte la 2, daca diametrul este 8, atunci raza este 4
        area = Math.PI * radius * radius;
        return area;


    }

    public static void main(String[] args) {

    }

}
