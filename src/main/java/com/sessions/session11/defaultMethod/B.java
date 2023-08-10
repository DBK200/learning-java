package com.sessions.session11.defaultMethod;

public interface B {

    public default void calculateNumbers(){
        System.out.println("Calculate numbers in B");
    }
}
