package com.sessions.session11.abstraction.HomeworkSession11ex4;

public class Main {

    public static void main(String[] args) {
        // Create an object of Area class
        System.out.println();
        Area obj = new Area();

        // Call the 3 methods implemented in the Area class using the object of this class, called obj
        // Area for a rectangle

        double rArea = obj.rectangleArea(3.7, 4.9);
        System.out.println("The area of a rectangle of 3.7 length and 4.9 breadth is " + rArea);
        System.out.println();

        double sArea = obj.squareArea(5.5);
        System.out.println("The area of a square of 5.5 side is " + sArea);
        System.out.println();

        double cArea = obj.circleArea(5.2);
        System.out.println("The area of a circle of 5.2 radius is " + cArea);
    }
}
