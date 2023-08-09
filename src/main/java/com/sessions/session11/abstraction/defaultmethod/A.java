package com.sessions.session11.abstraction.defaultmethod;

public interface A {

    public default String calculateNumbers(){
        //System.out.println("Calculating numbers in A");
        return "Calculating numbers in A";
    }
}
