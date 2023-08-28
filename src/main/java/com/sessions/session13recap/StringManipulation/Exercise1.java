package com.sessions.session13recap.StringManipulation;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.println("The string entered has " + input.length() + " characters.");
    }
}
