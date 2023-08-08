package com.sessions.session11.abstraction.defaultmethod;

public interface A {
    //..abstract methods..

    public default String calculateNumbers(){
        return "calculating numbers in A";
    }
}
