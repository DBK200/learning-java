package com.sessions.session11.defaultmethod;

public interface B {

    public  default String calculateNumbers(){

        return  "calculating numbers in B";
    }
}
