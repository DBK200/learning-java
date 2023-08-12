package com.sessions.session12.practice.overloading;

public class Test {
    private double calculateArea(int side){
        return Math.pow(side,2);
    }

    // Method's signature must be different for overloaded methods
    // Method's signature is:
    // - number of arguments
    // - arguments types
    // Next method doesn't comply with argument type
    // even though argument name and return type are different
/*
    private int calculateArea(int x) {
        System.out.println("ceva");
        return 2;
    }
*/

    // Next declaration checks out
    private double calculateArea(int length, int width){
        return length * width;
    }


    private Double calculateArea(double radius){
        return 3.14 * Math.pow(radius,2);
    }

    public static void main(String[] args) {
        System.out.println("Square area is: " + new Test().calculateArea(2));
        System.out.println("Rectangle area is: " + new Test().calculateArea(2,3));
        System.out.println("Circle area is: " + new Test().calculateArea(2.5));
    }
}
