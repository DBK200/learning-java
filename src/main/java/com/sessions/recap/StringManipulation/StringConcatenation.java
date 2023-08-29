package com.sessions.recap.StringManipulation;

import java.util.Scanner;

public class StringConcatenation {

    //String Concatenation: Write a program that prompts the user to enter
    // two strings and concatenates them using the + operator. Print out the concatenated string.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String string= scanner.nextLine();
        String string2=scanner.nextLine();
        String concat=string+string2;
        System.out.println(concat);

    }
}
