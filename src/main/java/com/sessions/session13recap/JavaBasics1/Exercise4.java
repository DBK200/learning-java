package com.sessions.session13recap.JavaBasics1;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a single character: ");
        char input = scanner.next().charAt(0);
        int inputAsInt = Character.getNumericValue(input);
        if (inputAsInt < 0) {
            System.out.println("The value entered has no int value.");
        } else {
            System.out.println("The int value entered is " + inputAsInt);
        }
    }
}
