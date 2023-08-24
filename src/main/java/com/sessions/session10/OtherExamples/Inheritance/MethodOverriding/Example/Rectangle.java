package com.sessions.session10.OtherExamples.Inheritance.MethodOverriding.Example;

public class Rectangle extends Figure{

    Rectangle(double a, double b){
        super(a,b);
    }

    //override are for rectangle
    @Override
    double area(){
        System.out.println("Inside Area for Rectangle");
        return dim1*dim2;
    }
}
