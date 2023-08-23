package com.sessions.session12.homework;

public class MathOperations
{
    //Method Overloading with diffrent types of arguments

    public int sum(int a,int b)
    {
        return a+b;
    }
    public double sum(double a,double b)
    {
        return a+b;
    }


    //Method Overloading with diffrent numbers of arguments
    public int sum(short c, short d)
    {
        return c+d;
    }
    public int sum(short c,short d,short e)
    {
        return c+d+e;
    }
}
