package com.sessions.session10;

public class InitializersDavid {

    int y;
    {
        int x=2;
        y=2;
        System.out.println("Inside instance initializer ");
    }

    static {
        System.out.println("Inside static initializer");
    }

    public InitializersDavid(){
        System.out.println("Inside constructor");
    }

    public static void main(String[] args) {
        InitializersDavid initializersDavid=new InitializersDavid();
//        InitializersDavid initializersDavid2=new InitializersDavid();
        initializersDavid.printStuff();


    }
    private void printStuff(){
        System.out.println("Inside printStuff method");
    }

}
