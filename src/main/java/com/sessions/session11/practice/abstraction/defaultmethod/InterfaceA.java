package com.sessions.session11.practice.abstraction.defaultmethod;

public interface InterfaceA {

    default String calculateNumbers(){
        return "Calculating numbers in A";
    }
}

