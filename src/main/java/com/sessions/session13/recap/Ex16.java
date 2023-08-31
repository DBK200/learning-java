package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex16 {

    //Write a program that prompts the user to enter two strings and concatenates them using the + operator.
    // Print out the concatenated string.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter two strings: ");

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.println(input1 + input2);


    }
}
