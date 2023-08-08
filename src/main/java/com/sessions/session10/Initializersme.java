package com.sessions.session10;

public class Initializersme {
    int y;
    {
        int x = 2;
        y=2;
        System.out.println("Inside instance initializer");
    }
    static {
        System.out.println("Inside Static initializer");
    }
    public Initializersme(){
        System.out.println("Inside constructor");
    }
    public static void main(String[] args) {
        Initializersme initializersme = new Initializersme();
      initializersme.printStuff();
    }
    private void printStuff(){
        System.out.println("Inside printStuff method");
    }
}
