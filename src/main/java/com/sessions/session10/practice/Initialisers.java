package com.sessions.session10.practice;

public class Initialisers {
    private static int y = 1;

    // Instance initialiser -> needs an instance to execute
    {
        System.out.println("Inside instance initialiser: y = " + ++y);
    }

    // Static initialiser -> runs before an instance initialiser, only one time
    static {
        System.out.println("Inside static initialiser: y = " + y);
    }

    // Constructor
    public Initialisers(){
        System.out.println("Inside constructor: y = " + ++y);
    }

    // Class method - executed after constructor
    private void printStuff() {
        System.out.println("Inside printStuff() method: y = " + ++y);
    }
    public static void main(String[] args) {
        Initialisers initialiser1 = new Initialisers();
        initialiser1.printStuff();
        System.out.println("=== Next instance ====");
        Initialisers initialiser2 = new Initialisers();
    }
}
