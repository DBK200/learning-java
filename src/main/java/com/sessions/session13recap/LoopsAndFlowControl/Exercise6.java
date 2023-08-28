package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number to calculate sum and negative number to exit: ");
        int number = scanner.nextInt();

        int sum = 0;
        while (true) {
            sum += number;
            number = scanner.nextInt();
            if (number < 0) {
                break;
            }
        }

        System.out.print("The sum of positive numbers entered is: " + sum);
    }
}
