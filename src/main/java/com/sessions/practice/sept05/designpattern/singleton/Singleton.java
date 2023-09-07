package com.sessions.practice.sept05.designpattern.singleton;

public class Singleton {

    // singleton design pattern ensures that a class has only ONE INSTANCE
    // and provides a global point of access to that instance

    // Elements
    //1. private constructor
    private Singleton(){

    }

    // 2. static instance - create a static instance of the class within the class itself
    private static Singleton instance;

    // 3. Lazy initialization: provide a public static method to access the instance
    // initialize the instance tithin this method if it is null (lazy initialization)

    // practic se face o alta metoda care sa asigure accesul la instanta deoarece
    // constructorul este privat
    public static Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    // These steps ensure that only one instance of the Singleton class is created
    // and shared accross the application and it is accessible via code " Singleton.getInstance() "

}
