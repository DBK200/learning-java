package com.sessions.session9.OtherExamples.OverloadedConstructors;
/*
* Box class defines 3 constructors to initialize the dimensions of a box various ways.
* */
public class Box {

    double width;
    double height;
    double depth;

    //constructor used when all dimensions specified.
    public Box(double width,double height, double depth)
    {
        this.width=width;
        this.depth=depth;
        this.height=height;
    }

    //constructor used when no dimensions specified
    public Box(){
        //use -1 to indicate and uninitialized box.
        this.width=-1;
        this.depth=-1;
        this.height=-1;
    }

    //constructor used when cube is created
    public Box(double len){
        this.width=this.height=this.depth=len;
    }

    //compute and return volume
    public double volume(){
        return this.width*this.height*this.depth;
    }
}
