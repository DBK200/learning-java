package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex20 {

    // Write a program that prompts the user to enter a name and an age, and formats them into a sentence using the String.format() method.
    // Print out the formatted sentence.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        int age = scanner.nextInt();

        String formattedSentence = String.format("Hello, my name is %s and I am %d years old.", name, age);
        System.out.println(formattedSentence);
    }
}
