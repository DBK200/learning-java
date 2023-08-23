package com.sessions.session12.polymorphims.Homework.Homework1;

public interface Person {

    int num = 24;
    String name = "Ion";

    default int getNum(){
        return num;
    }

    void printSomething();
}
