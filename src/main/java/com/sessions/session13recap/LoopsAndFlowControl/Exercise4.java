package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise4 {
    public static void isPrimeNumber(int n) {
        int i = 2, count = 0;
        while (i <= n / 2) {
            if (n % i == 0) {
                count++;
                break;
            }
            i++;
        }
        if (count == 0) {
            System.out.println("The number entered is prime number.");
        } else {
            System.out.println("The number entered is not a prime number.");
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        isPrimeNumber(number);
    }
}
