package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise5 {

    public static int getSumOfDigits(int n) {
        int sum = 0;
        do {
            sum += n % 10;
            n = n / 10;
        } while (n > 0);
        return sum;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        System.out.print("The sum of digits is: " + getSumOfDigits(number));
    }
}
