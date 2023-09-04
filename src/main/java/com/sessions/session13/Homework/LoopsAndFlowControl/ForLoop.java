package com.sessions.session13.Homework.LoopsAndFlowControl;

import java.util.Scanner;

public class ForLoop
{
    //For Loop: Write a program that prompts the user to enter
    // a number and calculates the factorial of that number
    // using a for loop. Print out the factorial of the number.
    public static void main(String[] args)
    {
        Scanner num=new Scanner(System.in);
        System.out.println("Enter a number:");
        int number=num.nextInt();
        int factorial=1;
        int i;
        for (i=1;i<=number;i++)
        {
            factorial *=i;
        }
        System.out.println("Factorial of " +number + " is " +factorial );


    }


}
