package com.sessions.session13.Homework.BasicJava2;

public class Ex2
{
    //Arithmetic Operations: Declare two int variables and perform arithmetic
    // operations on them, such as addition,
    //subtraction, multiplication, and division. Print out the results of each
    // operation to verify that they were
    //calculated correctly.
    public static void main(String[] args)
    {
        System.out.println("Addition:" +addition1(23,27));
        System.out.println("Subtraction:" +subtraction(30,27));
        System.out.println("Multiplication:" +multiplication(3,7));
        System.out.println("Division:" +division(30,0));


    }
    public static int addition1(int x,int y)
    {
        return x+y;
    }
    public static int subtraction(int x,int y)
    {
        return x-y;
    }
    public static int multiplication(int x,int y)
    {
        return x*y;
    }
    public static int division(int x,int y)
    {

        if(y==0)
        {
            System.out.println("Y nu poate fi 0");
            return 0;
        }
        else return x/y;


    }
}
