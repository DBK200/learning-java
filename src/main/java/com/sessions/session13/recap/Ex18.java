package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex18 {

    //Write a program that prompts the user to enter two strings and compares them using the equals() method.
    // Print out a message indicating whether the strings are equal or not.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input1 = scanner.nextLine();
        String input2 = scanner.nextLine();

        System.out.println(input1.equals(input2));

    }




}
