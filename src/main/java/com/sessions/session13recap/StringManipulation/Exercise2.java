package com.sessions.session13recap.StringManipulation;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input1 = scanner.next();
        System.out.print("Enter another string: ");
        String input2 = scanner.next();
        System.out.println("The concatenated string: " + input1 + input2);
    }
}
