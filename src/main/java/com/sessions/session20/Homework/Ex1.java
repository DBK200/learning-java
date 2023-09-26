package com.sessions.session20.Homework;

import java.util.Scanner;

public class Ex1
{
    //Write a Java program that asks the user for two numbers and attempts to divide them.
    // Use try-catch to handle the case where division by zero occurs.

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int x=scanner.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int y=scanner.nextInt();
        float division;
        try {
            division = x / y;
            System.out.println("Division:" + division);
        }catch (ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
    }
}
