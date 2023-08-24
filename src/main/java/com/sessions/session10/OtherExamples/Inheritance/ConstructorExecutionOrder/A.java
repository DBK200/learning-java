package com.sessions.session10.OtherExamples.Inheritance.ConstructorExecutionOrder;

public class A {

    A(){
        System.out.println("Inside A's no params constructor");
    }

    A(int i){
        System.out.println("Inside A's 1 param constructor, i: "+ i);
    }
}
