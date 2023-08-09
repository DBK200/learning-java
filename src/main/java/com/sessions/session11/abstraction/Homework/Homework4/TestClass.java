package com.sessions.session11.abstraction.Homework.Homework4;

public class TestClass {
    public static void main(String[] args) {

        Area area = new Area();
        System.out.println("Rectangle area is: " + area.rectangleArea(20, 25));
        System.out.println("Square area is: " + area.squareArea(10));
        System.out.println("Circle area is: " + area.circleArea(15));
    }
}
