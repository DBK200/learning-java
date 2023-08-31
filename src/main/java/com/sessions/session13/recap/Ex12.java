package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex12 {

    //Write a program that prompts the user to enter a number and calculates the sum of the
    // digits of that number using a do-while loop.
    // Print out the sum of the digits.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int sum = 0;

        do {
            int digit = input % 10;
            sum += digit;
            input /= 10;
        }while (input > 0);

        System.out.println("The sum of its digits: " + sum);
    }
}
