package com.sessions.session13.Homework.StringManipulation;

import java.util.Scanner;

public class Replacement
{
    //Character Replacement: Write a program that prompts the user to
    // enter a string and replaces all occurrences of a specific
    // character in the string with another character using the replace() method.
    // Print out the modified string.
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String:");
        String name=scanner.nextLine();
        System.out.println("The modified string:" +replace(name));
    }
    public static String  replace(String string1)
    {
        return string1.replace('a','r');
    }
}
