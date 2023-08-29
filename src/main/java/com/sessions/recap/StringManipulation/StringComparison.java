package com.sessions.recap.StringManipulation;

import java.util.Scanner;

public class StringComparison {

//    String Comparison: Write a program that prompts the user to enter two strings and
//    compares them using the equals() method. Print out a message indicating whether the
//    strings are equal or not.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String string=scanner.nextLine();
        String string2=scanner.nextLine();
        if(string.equals(string2))
            System.out.println("The strings are equal");
        else
            System.out.println("The strings are not equal");
    }
}
