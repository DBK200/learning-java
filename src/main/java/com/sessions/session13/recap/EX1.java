package com.sessions.session13.recap;

public class EX1
{
    //Division by Zero: Write a program that divides two
    // int values. What happens if the second value is zero? How can you handle this scenario?
    private static int devide(int x,int y)
    {
//        if(y==0)
//        {
//            System.out.println("Division by zero");
//            return 0;
//        }

        try{
            return x/y;

        }catch(ArithmeticException exception)
        {
            System.out.println("Division by zero");
        }
        return 0;
    }

    public static void main(String[] args)
    {
        System.out.println(devide(2,0));
    }
}
