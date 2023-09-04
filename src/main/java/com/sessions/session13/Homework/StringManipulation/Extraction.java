package com.sessions.session13.Homework.StringManipulation;

import java.util.Scanner;

public class Extraction
{

    //Substring Extraction: Write a program that prompts the user to
    // enter a string and extracts a substring from the string
    //using the substring() method. Print out the extracted substring.

    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a string:");
        String string=scanner.nextLine();
        System.out.println("The extracted substring:"+substring(string));

    }
    public static String substring(String string)
    {
        String substring=string.substring(1,3);
        return substring;
    }
}
