package com.sessions.session13.Homework.StringManipulation;

import java.util.Scanner;

public class Concatenation
{

    //String Concatenation: Write a program that prompts the user
    // to enter two strings and concatenates them
    //using the + operator. Print out the concatenated string.

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the first string:");
        String firstString=scanner.nextLine();
        System.out.println("Enter the second string:");
        String secondString=scanner.nextLine();
        String concat=firstString+secondString;
        System.out.println("The concatenated string:" +concat);
    }
}
