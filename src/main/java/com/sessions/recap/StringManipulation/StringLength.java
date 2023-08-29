package com.sessions.recap.StringManipulation;

import java.util.Scanner;

public class StringLength {

//    String Length: Write a program that prompts the user to enter a string and prints out the length of the string.

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String string= scanner.nextLine();
        System.out.println(string.length());
    }

}
