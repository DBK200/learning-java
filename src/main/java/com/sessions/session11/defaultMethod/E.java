package com.sessions.session11.defaultMethod;

public interface E {
    //abstracts methods
    //interfata-are metode cu implementare(default)
    public default String calculateNumbers()
    {
        //logica
        return "calculating numbers in E";
    }
}
