package com.sessions.session13.Homework.StringManipulation;

import java.util.Scanner;

public class Length
{
    //String Length: Write a program that prompts
    // the user to enter a string and prints out the length of the string.
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String name=scanner.nextLine();
        System.out.println("The length of the string is:" +name.length());
    }
}
