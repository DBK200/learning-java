package com.sessions.session9.OtherExamples.ObjectsAsParameters;

public class Box {

    double width;
    double height;
    double depth;

    //Constructor that takes an object of type Box
    public Box(Box ob){
        width=ob.width;
        depth=ob.depth;
        height=ob.height;
    }
    public Box(double width,double height, double depth)
    {
        this.width=width;
        this.depth=depth;
        this.height=height;
    }


    public Box(){
        //use -1 to indicate and uninitialized box.
        this.width=-1;
        this.depth=-1;
        this.height=-1;
    }


    public Box(double len){
        this.width=this.height=this.depth=len;
    }


    public double volume(){
        return this.width*this.height*this.depth;
    }
}
