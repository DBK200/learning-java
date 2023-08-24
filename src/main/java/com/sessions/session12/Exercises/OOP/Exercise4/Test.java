package com.sessions.session12.Exercises.OOP.Exercise4;

public class Test {
//    Write a Java program to create a class called "Circle" with a radius attribute.
//    You can access and modify this attribute. Calculate the area and circumference of the circle.

    public static void main(String[] args) {

        Circle circle=new Circle(3);
        circle.setRadius(4);
        System.out.println("Aria="+circle.aria());
        System.out.println("Circumference="+circle.circumference());
    }
}
