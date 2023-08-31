package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex17 {

    //Write a program that prompts the user to enter a string and extracts a substring from the string using the substring() method.
    // Print out the extracted substring.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input.substring(0, 5));

    }

}
