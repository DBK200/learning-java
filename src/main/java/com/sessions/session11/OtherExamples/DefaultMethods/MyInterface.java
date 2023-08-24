package com.sessions.session11.OtherExamples.DefaultMethods;

public interface MyInterface {
    //"normal" interface method declaration
    int getNumber();

    //default method
    default String getString(){
        return "Default String";
    }

    //This is a static interface method.
    //Static interface methods are not inherited by either an implementing class or a subinterface.
    static int getDefaultNumber(){
        return 0;
    }
}
