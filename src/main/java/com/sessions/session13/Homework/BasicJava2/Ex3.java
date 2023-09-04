package com.sessions.session13.Homework.BasicJava2;

public class Ex3
{
    //Type Casting: Declare a variable of one data type, and then assign it to a variable of
    // another data type using
    //type casting. For example, declare a double variable and assign it to an int variable
    // using type casting.
    //Print out the value of the int variable to verify that the type casting was successful.

    public static void main(String[] args)
    {
        System.out.println("Type Casting");
        int x=3;
        short y=(short ) x;
        System.out.println("y=x="+y);
        double d=345;
        int g=(int)d;
        System.out.println("d=g="+g);
        long a=231;
        int s=(int)a;
        System.out.println("a=s="+s);
        double b=2312;
        long l=(long) b;
        System.out.println("l=b="+l);


    }
}
