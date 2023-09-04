package com.sessions.session13.Homework.LoopsAndFlowControl;

import java.util.Scanner;

public class Switch
{
    //Switch Statement: Write a program that prompts the user to enter a day of
    // the week and prints out a message
    // indicating whether it is a weekday or a weekend day, using a switch statement.
    public static void main(String[] args)
    {
        Scanner day1=new Scanner(System.in);
        System.out.println("Enter a day:");

        String day=day1.nextLine();
        switch (day)
        {
            case "Monday","Tuesday","Wednesday","Thursday","Friday":
                System.out.println("Is a week day");
                break;
            case "Saturday","Sunday":
                System.out.println("Is a weekend day");
                break;
            default:
                System.out.println("Error");


        }
    }
}
