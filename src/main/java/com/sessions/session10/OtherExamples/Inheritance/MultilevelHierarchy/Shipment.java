package com.sessions.session10.OtherExamples.Inheritance.MultilevelHierarchy;

//Add shipping cost
public class Shipment extends BoxWeight{
    double cost;

    Shipment(Shipment obj){
        super(obj);
        this.cost=obj.cost;
    }

    //constructor when all parameters are specified
    Shipment(double width, double height, double depth,double weight, double cost){
        super(width, height,depth,weight); //super() always refers to the constructor in the closest superclass.
        this.cost=cost;
    }

    //default constructor
    Shipment(){
        super();
        this.cost=-1;
    }

    //constructor used when cube is created
    Shipment(double len,double weight, double cost){
        super(len,weight);
        this.cost=cost;
    }
}
