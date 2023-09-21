package com.sessions.session21.practice.creational;

public class Singleton {
    private static Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if (instance == null) instance = new Singleton();
        return instance;
    }
}
