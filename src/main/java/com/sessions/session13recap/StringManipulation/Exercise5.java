package com.sessions.session13recap.StringManipulation;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.next();
        System.out.println("String with first character replaced by 'Z': " + input.replace(input.charAt(0), 'Z'));
    }
}
