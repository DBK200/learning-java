package com.sessions.session21.creational;

public class SingletonAV {
    private static SingletonAV instance;

    private SingletonAV() {}
    public static SingletonAV getInstance() {
        if (instance == null) {
            instance = new SingletonAV();
        }
        return instance;
    }
}

class Test {
    public static void main(String[] args) {
        SingletonAV mySingleton = SingletonAV.getInstance();
        System.out.println(mySingleton);

        SingletonAV mySingleton2 = SingletonAV.getInstance();
    }
}