package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;


public class StringToInt {

    public static boolean isParsable(String userInput) {
        try {
            Integer.parseInt(userInput);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        // Scenario : Write a program that prompts the user to enter a string representing an integer value.
        //Convert the string to an int using the Integer.parseInt() method. What happens if the string cannot be parsed as an integer? How can you handle this scenario?


        // If the string cannot be parsed as an integer we will get a number format exception. To avoid this I would implement a check :

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Insert a number representing an integer value :");
        String userInput = scanner.nextLine();
        if (isParsable(userInput)) {
            System.out.println("You have entered : " + Integer.parseInt(userInput));
        } else {
            System.out.println("That is not a number");
        }

    }
}
