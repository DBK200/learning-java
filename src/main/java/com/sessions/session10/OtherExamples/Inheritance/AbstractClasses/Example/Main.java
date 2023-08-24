package com.sessions.session10.OtherExamples.Inheritance.AbstractClasses.Example;

public class Main {
    public static void main(String[] args) {
//        Figure f= new Figure(10,10) ;//illegal

        Rectangle r = new Rectangle(9, 5);
        System.out.println("Area is " + r.area());


        System.out.println();


        Figure t = new Triangle(10, 8);
        System.out.println("Area is " + t.area());
    }
}
