package com.sessions.session10.OtherExamples.Inheritance.ConstructorExecutionOrder;

public class Main {
    public static void main(String[] args) {
        C c0=new C();

        System.out.println();

        C c1=new C(1);


        System.out.println();

        C c2=new C(1,2);


        System.out.println();

        C c3=new C(1,2,3);
    }
}
