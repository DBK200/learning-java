package com.sessions.session10;

public class WorkWithInitializers
{
    int y;

    {
        int x = 2;
        y = 2;

        System.out.println("Inside instance initializer");
    }

    static
    {
        System.out.println("Inside static initializer");
    }

    public WorkWithInitializers()
    {
        System.out.println("Inside constructor");
    }

    public static void main(String[] args)
    {
        WorkWithInitializers initializers = new WorkWithInitializers();
        //WorkWithInitializers initializers2 = new WorkWithInitializers();
        initializers.printStuff();
    }

    private void printStuff()
    {
        System.out.println("We are inside a private method.");
    }
}