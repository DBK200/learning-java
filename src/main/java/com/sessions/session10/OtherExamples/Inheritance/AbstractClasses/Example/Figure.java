package com.sessions.session10.OtherExamples.Inheritance.AbstractClasses.Example;

public abstract class Figure {

    double dim1;
    double dim2;

    Figure(double a, double b){
        dim1=a;
        dim2=b;
    }

    //area is now abstract method
    abstract double area();
}
