package com.sessions.session21.creational;

public class Singleton {
    private static Singleton instance;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
class Test{
    public static void main(String[] args) {
        Singleton mySingletton = Singleton.getInstance();
        System.out.println(mySingletton);

        Singleton mySingleton2 = Singleton.getInstance();
    }
}

