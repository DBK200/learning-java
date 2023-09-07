package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;

public class ContinueStatement {

    //Scenario : Write a program that prompts the user to enter a series of numbers and calculates the sum of
    //the even numbers using a continue statement to skip over the odd numbers.

    public static void main(String[] args) {
        System.out.println(" Enter a series of number you want to add. Enter 0 when you are done . Only the even numbers will count.");
        int a;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (true) {
            a = scanner.nextInt();
            if (a % 2 != 0) {
                continue;
            }
            sum = sum + a;
            if (a == 0) {
                break;
            }

        }
        System.out.println("Your sum is equal to " + sum);
    }

}
