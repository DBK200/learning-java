package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise3 {
    public static long getFactorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("Factorial is: " + getFactorial(number));
    }
}
