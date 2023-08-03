package com.sessions.session10.practice;

public class Initialisers {
    private static int y = 1;

    // Instance initialiser -> needs an instance to execute
    {
        System.out.println("Inside instance initialiser: " + y);
    }

    // Static initialiser -> runs first, one time
    static {
        System.out.println("Inside static initialiser " + y);
    }

    public Initialisers(){
        System.out.println("Inside constructor " + ++y);
    }

    private void printStuff() {
        System.out.println("Inside printStuff() method");
    }
    public static void main(String[] args) {
        Initialisers initialiser1 = new Initialisers();
        initialiser1.printStuff();
        Initialisers initialiser2 = new Initialisers();
    }
}
