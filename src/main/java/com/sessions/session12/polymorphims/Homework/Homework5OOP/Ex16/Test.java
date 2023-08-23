package com.sessions.session12.polymorphims.Homework.Homework5OOP.Ex16;

import com.sessions.session11.abstraction.defaultMethod.C;

public class Test {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(10.5, 15.2);
        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(10.2);
        System.out.println(circle.getArea());
        System.out.println(circle.getPerimeter());

        Triangle triangle = new Triangle(10, 15, 18, 17);
        System.out.println(triangle.getArea());
        System.out.println(triangle.getPerimeter());
    }
}
