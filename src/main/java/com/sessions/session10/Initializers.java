package com.sessions.session10;

public class Initializers {
    int y;

    {
        int x=2;
        y=2;
        System.out.println("Inside instance initializer");
    }

   final static int NUMBER;
    final static int NUMBER2 = 3;

    // static se ruleaza la inceputul clasei o singura data si e mereu primul
    static{
        NUMBER=2;
        //NUMBER2 = 3; // does not compile, value already asigned
        System.out.println("Inside static initializer");
    }

    public Initializers(){
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        Initializers initializers = new Initializers();
       // Initializers initializers2 = new Initializers();
        initializers.printSuff();
    }

    private void printSuff(){
        System.out.println("Inside printStuff method");
    }
}
