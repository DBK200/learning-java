package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;

public class BreakStatement {
    public static void main(String[] args) {
        //Scenario : Write a program that prompts the user to enter a series of numbers until they enter a negative
        //number. Calculate the sum of the positive numbers using a break statement to exit the loop when a negative number
        // is entered.


        System.out.println("Enter the numbers you want to add");
        int a, sum;
        Scanner scanner = new Scanner(System.in);
        sum = 0;
        while (true) {
            a = scanner.nextInt();
            if (a >= 0) {
                sum = sum + a;
            } else {
                break;
            }

        }
        System.out.println("You sum is equal to : " + sum);
    }
}
