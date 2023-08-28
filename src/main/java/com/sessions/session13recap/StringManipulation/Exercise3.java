package com.sessions.session13recap.StringManipulation;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.println("Substring from index 2:" + input.substring(2));
        System.out.println("Substring from index 0 to 2:" + input.substring(0, 2));
    }
}
