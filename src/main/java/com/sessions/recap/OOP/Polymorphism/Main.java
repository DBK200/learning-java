package com.sessions.recap.OOP.Polymorphism;

public class Main {

//    Create an abstract class Shape with an abstract method area(). Create subclasses such as
//        Rectangle, Triangle, and Circle that implement the area() method differently.
//    Create an array of Shape objects, and iterate through the array to calculate and print the
//    area of each shape.

    public static void main(String[] args) {

        Shape[] shapes= {new Rectangle(4,5),new Triangle(3,6),new Circle(5)};
        for (Shape shape:shapes){
            shape.area();
        }
    }
}
