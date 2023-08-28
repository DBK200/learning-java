package com.sessions.session13recap.StringManipulation;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input1 = scanner.next();
        System.out.print("Enter another string: ");
        String input2 = scanner.next();

        if (input1.equals(input2)) {
            System.out.println("The strings entered are equal.");
        } else {
            System.out.println("The strings entered are not equal.");
        }
    }
}
