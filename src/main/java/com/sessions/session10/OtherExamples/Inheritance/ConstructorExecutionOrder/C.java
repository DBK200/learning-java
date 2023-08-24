package com.sessions.session10.OtherExamples.Inheritance.ConstructorExecutionOrder;

public class C extends B{
    C(){
        System.out.println("Inside C's no params constructor");
    }

    C(int z){
        System.out.println("Inside C's 1 param constructor, z: "+ z);
    }


    C( int j,int z){
        super(j);
        System.out.println("Inside C's 2 param constructor, z: "+ z);
    }

    C(int i, int j,int z){
        super(i,j);
        System.out.println("Inside C's 2 param constructor, z: "+ z);
    }
}
