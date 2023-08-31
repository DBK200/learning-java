package com.sessions.session13.recap;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ex2 {

    //Write a program that prompts the user to enter a string representing an integer value.
    //Convert the string to an int using the Integer.parseInt() method.
    //What happens if the string cannot be parsed as an integer? How can you handle this scenario?

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an int: ");
        String input = scanner.nextLine();

        try {
            int inputAsInt = Integer.parseInt(input);
            System.out.println("Your input as int: " + inputAsInt);
        }catch (NumberFormatException e){
            System.out.println("error");
        }

    }
}
