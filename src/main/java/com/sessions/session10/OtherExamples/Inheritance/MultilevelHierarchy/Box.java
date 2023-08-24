package com.sessions.session10.OtherExamples.Inheritance.MultilevelHierarchy;

public class Box {

    private double width;
    private double height;
    private double depth;

    //construct clone of an object
    Box( Box obj){
        this.width=obj.width;
        this.height=obj.height;
        this.depth=obj.depth;
    }

    //constructor used when all dimensions specified
    Box( double width, double height, double depth){
        this.width=width;
        this.height=height;
        this.depth=depth;
    }

    //constructor used when no dimensions specified
    Box(){
        //-1 used to indicate an uninitialized box
        this.width=-1;
        this.height=-1;
        this.depth=-1;
    }

    //constructor used when cube is created
    Box(double len){
        width=height=depth=len;
    }

    //compute and return volume
    double volume(){
        return width * height * depth;
    }
}
