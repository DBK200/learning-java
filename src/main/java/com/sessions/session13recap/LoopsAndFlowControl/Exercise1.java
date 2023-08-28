package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 != 0) {
            System.out.println("Number entered is odd");
        } else {
            System.out.println("Number entered is even");
        }
    }
}
