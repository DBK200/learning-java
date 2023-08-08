package com.sessions.session11.defaultmethod;

public interface A {
        // abstract method
    public default String calculateNumbers(){
        return "calculating numbers in A";
    }
}
