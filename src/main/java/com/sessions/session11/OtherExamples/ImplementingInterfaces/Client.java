package com.sessions.session11.OtherExamples.ImplementingInterfaces;

public class Client implements Callback{
    //Implements Callback's interface
    @Override
    public void callback(int param) { //when you implement an interface method, it must be declared public
        System.out.println("callback called with "+ param);
    }

    @Override
    public void callback2(int param1, int param2) {
        System.out.println("callback called with "+param1+ " "+param2);
    }


    //additional method
    void nonIfaceMeth(){
        System.out.println("Other member of the class");
    }


}
