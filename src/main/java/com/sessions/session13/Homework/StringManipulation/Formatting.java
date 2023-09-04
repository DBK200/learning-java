package com.sessions.session13.Homework.StringManipulation;

import java.util.Scanner;

public class Formatting
{
    //String Formatting: Write a program that prompts the user to
    // enter a name and an age, and formats them into a sentence
    // using the String.format() method. Print out the formatted sentence.
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the name:");
        String name=scanner.nextLine();
        System.out.println("Enter the age:");
        int age=scanner.nextInt();
        String formattedSentence=String.format("My name is" +name +",and i am "+age+" years old");
        System.out.println(formattedSentence);



    }

}
