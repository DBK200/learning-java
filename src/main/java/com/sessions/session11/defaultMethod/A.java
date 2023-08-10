package com.sessions.session11.defaultMethod;

public interface A {

    public default void calculateNumbers(){
        System.out.println("Calculate numbers in A");
    }
}
