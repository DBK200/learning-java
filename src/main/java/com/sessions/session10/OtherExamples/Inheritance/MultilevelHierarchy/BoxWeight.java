package com.sessions.session10.OtherExamples.Inheritance.MultilevelHierarchy;

import com.sessions.session10.OtherExamples.Inheritance.PracticalExample.BoxWeightWithSuper;

public class BoxWeight extends Box{

    double weight;

    //constructor clone of an object
    BoxWeight(BoxWeight obj){
        super(obj);
        weight=obj.weight;
    }

    //constructor when all parameters are specified
    BoxWeight(double width, double height, double depth, double weight){
        super(width, height,depth);
        this.weight=weight;
    }

    //default constructor
    BoxWeight(){
        super();
        this.weight=-1;
    }

    //constructor used when cube is created
    BoxWeight(double len, double weight){
        super(len);
        this.weight=weight;
    }
}
