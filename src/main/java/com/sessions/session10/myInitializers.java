package com.sessions.session10;

public class myInitializers {

    int y;

    {
        int x = 2;
        y = x;
        System.out.println("Inside instance initializer y=" + y);
    }

    final static int NUMBER;

    static {
        NUMBER = 2;
        System.out.println("Inside static initializer");
        System.out.println("Number: " + NUMBER);
    }

    public myInitializers() {
        System.out.println("Inside constructor");
    }

    public void printstuff() {
        System.out.println("Inside print method");
    }

    public static void main(String[] args) {
        myInitializers initializers = new myInitializers();
        myInitializers initializers2 = new myInitializers();
        initializers.printstuff();
    }

}
