package com.sessions.session11.Homework.Exercise3;

import com.sessions.session11.Homework.Exercise4.ShapeM;

public class SubClassM extends ClassWithConstructor {

    public void a_method() {
        System.out.println("This is abstract method");
    }


    public static void main(String[] args) {
        SubClassM subClassM = new SubClassM();
        subClassM.a_method();
        subClassM.non_abstract();

    }
}



