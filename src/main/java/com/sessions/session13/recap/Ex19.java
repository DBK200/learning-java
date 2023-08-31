package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex19 {

    //Write a program that prompts the user to enter a string and replaces all occurrences of a specific character in the string with another character using the replace() method.
    // Print out the modified string.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input.replace("a", "b"));
    }
}
