package com.sessions.session13recap.JavaBasics1;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer value: ");
        String input = scanner.next();
        int inputAsInteger;
        try {
            inputAsInteger = Integer.parseInt(input);
            System.out.println("The value entered is " + inputAsInteger);
        } catch (NumberFormatException e) {
            System.out.println("The value entered is not an integer.");
        }
    }
}
