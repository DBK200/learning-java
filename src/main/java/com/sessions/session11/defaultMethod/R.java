package com.sessions.session11.defaultMethod;

public interface R {
    public default String calculateNumber()
    {
        //logica
        return "calculating numbers in R";
    }
}
