package com.sessions.session10.OtherExamples.Inheritance.ConstructorExecutionOrder;

public class B extends A{
    B(){
        System.out.println("Inside B's no params constructor");
    }


    B(int j){
        System.out.println("Inside B's 1 param constructor, j: "+ j);
    }


    B(int i, int j){
        super(i);
        System.out.println("Inside B's 2 param constructor, j: "+ j);
    }
}
