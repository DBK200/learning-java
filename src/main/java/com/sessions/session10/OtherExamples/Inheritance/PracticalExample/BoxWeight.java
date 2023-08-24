package com.sessions.session10.OtherExamples.Inheritance.PracticalExample;

public class BoxWeight extends Box { //subclass of Box
    double weight;

    BoxWeight(double w, double h, double d, double weight){
        this.weight=weight;
        width=w;
        height=h;
        depth=d;
    }
}
