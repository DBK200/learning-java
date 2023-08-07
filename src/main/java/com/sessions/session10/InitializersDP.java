package com.sessions.session10;

public class InitializersDP {

    int y;
  //Ctrl+Alt+L
    // initializer
    {
        int x = 2;
        y = 2;
        System.out.println("Inside instance initializer");
    }

    final static int NUMBER;
    final static int NUMBER2=3;

    static {
        NUMBER=2;
        //NUMBER2=3; does not compile, value already assigned.
        System.out.println("Inside static initializer");
    }

    public InitializersDP(){
        System.out.println("Inside constructor");
    }

    private void printStuff(){
        System.out.println("stuff");
    }


    public static void main(String[] args){
        InitializersDP initializers= new InitializersDP();
        initializers.printStuff();
        InitializersDP initializers2= new InitializersDP();

    }
}
