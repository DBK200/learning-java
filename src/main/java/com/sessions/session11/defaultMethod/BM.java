package com.sessions.session11.defaultMethod;

public interface BM {

    public  default String calculateNumbers() {
        return "calculating numbers in B";
    }
}



