package com.sessions.session11.Homework.Exercise4;

import java.awt.geom.Area;

public class AreaM extends ShapeM {

    public int rectangleArea(int length, int width) {
        //Area of a rectangle = length × width
        return length * width;
    }

    public int squareArea(int x) {
        //A=a2
        return x * 5;
    }

    public double circleArea(double area) {
        //Area = pi * r^2
        return area;


    }

    public static void main(String[] args) {
        AreaM areaM = new AreaM();
        areaM.rectangleArea(35,25);
        areaM.squareArea(5);
        double radius = 8 / 2; // raza cercului se imparte la 2 si este jumatate din diametru, daca diametrul este 8, atunci raza este 4
        areaM.circleArea(Math.PI * (radius * radius));
    }

}
