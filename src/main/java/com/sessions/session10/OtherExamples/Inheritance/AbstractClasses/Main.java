package com.sessions.session10.OtherExamples.Inheritance.AbstractClasses;

public class Main {
    public static void main(String[] args) {
        B b=new B();
        b.callMe();
        b.callMeToo();

        System.out.println();

        A b1=new B();
        b1.callMe();
        b1.callMeToo();

    }
}
