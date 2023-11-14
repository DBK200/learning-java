package com.sessions.examples_solid.open_close_principle.after;

public class DemoTest {

    public static void main(String[] args) {
        Shape rectangle = new Rectangle(2,3);
        System.out.println(rectangle.calculateArea());

        rectangle = new Circle(2);
        System.out.println(rectangle.calculateArea());
    }
}
