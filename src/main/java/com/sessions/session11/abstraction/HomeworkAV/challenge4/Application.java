package com.sessions.session11.abstraction.HomeworkAV.challenge4;

public class Application {
    public static void main(String[] args) {

        Area myArea = new Area();

        System.out.println("Rectangle area: " + myArea.rectangleArea(3,6));
        System.out.println("Square area: " + myArea.squareArea(4));
        System.out.println("Circle area: " + myArea.circleArea(2));
    }
}
