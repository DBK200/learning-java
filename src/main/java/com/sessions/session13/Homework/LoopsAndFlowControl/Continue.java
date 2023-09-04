package com.sessions.session13.Homework.LoopsAndFlowControl;

import java.util.Scanner;

public class Continue
{
    //Continue Statement: Write a program that prompts the user to enter a
    // series of numbers and calculates the sum of
    //the even numbers using a continue statement to skip over the odd numbers.
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        int number;
        int sum=0;
        while(true)
        {
            System.out.println("Enter a number:");
            number=scanner.nextInt();
            if(number<0)
            {
                break;
            }
            if(number%2!=0)
            {
                continue;
            }
            sum=sum=number;
        }
        System.out.println("The sum of even numbers is:" +sum);
    }
}
