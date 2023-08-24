package com.sessions.session10.OtherExamples.Inheritance.PracticalExample;


//complete implementation of BoxWeight Example using super()
public class BoxWeightWithSuper  extends Box {
    double weight;

    //constructor clone of an object
    BoxWeightWithSuper(BoxWeightWithSuper obj){
        super(obj); //super() should always be called first
        weight=obj.weight;
    }

    //constructor when all parameters are specified
    BoxWeightWithSuper(double width, double height, double depth, double weight){
        super(width, height,depth);
        this.weight=weight;
    }

    //default constructor
    BoxWeightWithSuper(){
        super();
        this.weight=-1;
    }

    //constructor used when cube is created
    BoxWeightWithSuper(double len, double weight){
        super(len);
        this.weight=weight;
    }
}
