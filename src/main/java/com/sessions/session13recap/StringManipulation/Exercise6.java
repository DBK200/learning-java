package com.sessions.session13recap.StringManipulation;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a name: ");
        String name = scanner.next();
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.println(String.format("The name entered is %s and the age %o", name, age));
    }
}
