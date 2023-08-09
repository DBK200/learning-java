package com.sessions.session11.abstraction.defaultmethod;

public interface B {

    public default String calculateNumbers(){
        //System.out.println("Calculating numbers in B");
        return "Calculating numbers in B";
    }
}
