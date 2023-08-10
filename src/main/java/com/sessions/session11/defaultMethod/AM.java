package com.sessions.session11.defaultMethod;

public interface AM {

    public  default String calculateNumbers(){
        return "calculating numbers in A";
    }
}
