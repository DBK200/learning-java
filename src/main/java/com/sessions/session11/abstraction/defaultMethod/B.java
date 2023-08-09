package com.sessions.session11.abstraction.defaultMethod;

public interface B {

    public default String calculateNumbers(){
        return "calculation numbers in B";
    }
}
