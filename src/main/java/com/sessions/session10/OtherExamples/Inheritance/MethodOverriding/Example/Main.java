package com.sessions.session10.OtherExamples.Inheritance.MethodOverriding.Example;

public class Main {
    public static void main(String[] args) {


        Figure figure;


        figure=new Figure(10,10);;
        System.out.println("Area is "+figure.area());
        System.out.println();

        figure=new Rectangle(9,5);
        System.out.println("Area is "+figure.area());
        System.out.println();

        figure=new Triangle(10,8);
        System.out.println("Area is "+figure.area());
        System.out.println();

    }
}
