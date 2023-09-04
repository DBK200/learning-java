package com.sessions.session13.Homework.StringManipulation;

import com.sessions.session11.tema.ex3.SubClass;

import java.util.Scanner;

public class Comparison
{
    //String Comparison: Write a program that prompts the user to enter
    // two strings and compares them using the equals() method.
    // Print out a message indicating whether the strings are equal or not.
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString=scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString=scanner.nextLine();

        if(theEqualsMethod(firstString,secondString))
        {
            System.out.println("The Strings are equal");
        }
        else
        {
            System.out.println("The Strings are not equal");
        }

    }
    public static boolean  theEqualsMethod(String string1,String string2)
    {
        return string1.equals(string2);
    }
}
