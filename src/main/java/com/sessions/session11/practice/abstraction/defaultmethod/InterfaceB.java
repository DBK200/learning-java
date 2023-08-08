package com.sessions.session11.practice.abstraction.defaultmethod;

public interface InterfaceB {
    default String calculateNumbers(){
        return "Calculating numbers in B";
    }
}