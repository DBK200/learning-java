package com.sessions.session11.OtherExamples.ImplementingInterfaces;

public class AnotherClient implements Callback {
    //Implement Callback's interface
    @Override
    public void callback(int param) {
        System.out.println("Another version of callback");
        System.out.println("param squared is " + (param * param));
    }

    @Override
    public void callback2(int param1, int param2) {
        System.out.println("Another version of callback2");
        System.out.println("param1 and param2 multiplied "+(param1*param2));
    }

}
