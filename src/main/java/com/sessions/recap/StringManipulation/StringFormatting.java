package com.sessions.recap.StringManipulation;

import java.util.Scanner;

public class StringFormatting {

//    String Formatting: Write a program that prompts the user to enter a name and an age,
//    and formats them into a sentence using the String.format() method. Print out the formatted sentence.

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        String age=scanner.nextLine();
        System.out.println(String.format("%s is %s",name,age));
    }
    // %s for Strig
    // %d for int
    // %f for float

}
