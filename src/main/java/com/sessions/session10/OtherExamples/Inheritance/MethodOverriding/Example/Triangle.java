package com.sessions.session10.OtherExamples.Inheritance.MethodOverriding.Example;

public class Triangle extends Figure {

    Triangle(double a, double b){
        super(a,b);
    }

    //override area for right triangle
    double area(){
        System.out.println("Inside Area for Triangle");
        return dim1*dim2/2;
    }
}
