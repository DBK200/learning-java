package com.sessions.session10.OtherExamples.Inheritance.PracticalExample;

public class ColorBox extends Box{ //subclass of Box

    String color;

    ColorBox(double w, double h, double d, String color){
        this.color=color;
        width=w;
        height=h;
        depth=d;
    }
}
