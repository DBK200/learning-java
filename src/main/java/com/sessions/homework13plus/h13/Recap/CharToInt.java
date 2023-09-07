package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;

public class CharToInt {


    public static void main(String[] args) {
        // Scenario : Write a program that prompts the user to enter a single character. Convert the character to its corresponding int value using the Character.getNumericValue() method.
        // What happens if the character is not a numeric digit? How can you handle this scenario?

        // If it is not a numeric digit you will get the unicode value of the character. To avoid this I would implement a simple check

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character : ");
        char userInput = scanner.next().charAt(0);
        if (Character.getNumericValue(userInput) >= 0 && Character.getNumericValue(userInput) < 10) {
            System.out.println("You have entered : " + Character.getNumericValue(userInput));
        } else {
            System.out.println(" That is not a number. It's unicode value is = " + Character.getNumericValue(userInput));
        }
    }
}
