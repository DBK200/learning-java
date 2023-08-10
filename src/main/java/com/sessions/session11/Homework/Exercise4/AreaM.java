package com.sessions.session11.Homework.Exercise4;

public class AreaM extends ShapeM{

    public int rectangleArea(int length, int width){
        length = 35;
        width = 25;
        return length * width;
    }
    public int squareArea(int x){
        return 5 * 5;
    }
    public double circleArea(double area){
        //Area = pi * r^2
         double radius = 8 / 2;
         area = Math.PI * radius * radius;
         return area;


    }
    public static void main (String[]args){

    }

}
