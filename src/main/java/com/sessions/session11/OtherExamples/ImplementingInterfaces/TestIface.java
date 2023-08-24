package com.sessions.session11.OtherExamples.ImplementingInterfaces;

public class TestIface {
    public static void main(String[] args) {
        Callback c=new Client(); //declared to be of interface type Callback
        c.callback(42); // c can access callback
//        c.nonIfaceMeth(); // c cannot access other members of class Client

//        Client c1=new Client();
//        c1.callback(12);
//        c1.nonIfaceMeth();

    //another client
        AnotherClient ac=new AnotherClient();


        c=ac; // c now refers to AnotherCleint object
        c.callback(42); //the version of callback() that is called is determined by the type of object that c refers at runtime.
    }
}
