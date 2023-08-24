package com.sessions.session11.OtherExamples.ImplementingInterfaces;


/*
If a class implements an interface but not fully implement the methods required
then the class must be declared as abstract
 */
public abstract class PartialImplementation implements Callback{

    int a,b;

    @Override
    public void callback(int param) { //when you implement an interface method, it must be declared public
        System.out.println("callback called from partial implementation class "+ param);
    }

    void show(){
        System.out.println(a + " "+ b);
    }
}
