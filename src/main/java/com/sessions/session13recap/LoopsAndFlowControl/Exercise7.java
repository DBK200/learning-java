package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a series of numbers followed by space and enter to end: ");
        String input = scanner.nextLine();
        String[] parts = input.split(" ");
        int[] numbers = new int[parts.length];
        int index = 0;
        for (String part: parts) {
            numbers[index] = Integer.parseInt(part);
            index++;
        }

        int sum = 0;

        for (int number : numbers) {
            if (number % 2 != 0) {
                continue;
            } else {
                sum += number;
            }
        }

        System.out.println("Sum of even numbers is: " + sum);
    }
}
