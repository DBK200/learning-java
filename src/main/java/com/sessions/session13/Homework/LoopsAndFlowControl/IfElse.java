package com.sessions.session13.Homework.LoopsAndFlowControl;

import java.util.Scanner;

public class IfElse
{
    //If-Else Statement: Write a program that prompts the user to enter
    // a number and checks if it is even or odd using
    // an if-else statement. Print out a message indicating whether the number is even or odd.
    public static void main(String[] args)
    {
        Scanner number=new Scanner(System.in);
        System.out.println("Enter a number:");
        int numar=number.nextInt();
        if(numar%2==0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
    }
}
