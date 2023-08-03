package com.sessions.session10;

public class InitializersR
{
        int y;
        //instance
        {
            int x = 2;
            y = 4;
            System.out.println("Inside instance initializer");
        }

        final static int NUMBER;
        final static int NUMBER2=3;

        //static initializer
        static
        {
            NUMBER=2;//nu da eroare deoarece prima data oricum compileaza static
          //  NUMBER2=3;does not compile
            System.out.println("Inside static initializer");
        }

        //constructor
    public InitializersR()
    {
        System.out.println("Inside constructor");
    }
    public static void main(String[] args)
    {
        InitializersR initializersR=new InitializersR();
        //InitializersR initializersR2=new InitializersR();
        initializersR.printStuff();

    }
    private void printStuff()
    {
        System.out.println("Inside printStuff method");
    }





}
