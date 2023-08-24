package com.sessions.session12.Exercises.OOP.Exercise3;

public class Test {
//    Write a Java program to create a class called "Rectangle" with width and height attributes.
//    Calculate the area and perimeter of the rectangle.
public static void main(String[] args) {

    Rectangle rectangle=new Rectangle(2,4);
    System.out.println("Area="+rectangle.getArea());
    System.out.println("Perimeter="+rectangle.getPerimeter());
    }
}
