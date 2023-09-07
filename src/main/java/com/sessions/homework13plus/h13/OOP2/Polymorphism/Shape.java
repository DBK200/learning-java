package com.sessions.homework13plus.h13.OOP2.Polymorphism;

//Polymorphism:
//Create an abstract class Shape with an abstract method area(). Create subclasses such as Rectangle,
//Triangle, and Circle that implement the area() method differently. Create an array of Shape objects, and
//iterate through the array to calculate and print the area of each shape.

import java.util.ArrayList;
import java.util.List;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        List<Shape> array = new ArrayList<>();
        Rectangle rectangle = new Rectangle("Rectangle", 13, 14);
        Triangle triangle = new Triangle("triangle", 20,10);
        Circle circle = new Circle("circle", 16);

        array.add(rectangle);
        array.add(triangle);
        array.add(circle);

        for(Shape shape:array){
            System.out.println("Area of " + shape.name + " is equal to " + shape.Area());
        }
    }


    public abstract double Area();

}
