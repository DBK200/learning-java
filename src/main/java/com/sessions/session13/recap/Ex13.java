package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex13 {

    //Write a program that prompts the user to enter a series of numbers until they enter a negative number.
    // Calculate the sum of the positive numbers using a break statement to exit the loop when a negative number is entered.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true){
            System.out.println("Enter a positive number to sum or a negative one to quit");
            int number = scanner.nextInt();
        if (number < 0){
            break;
        }
        sum += number;
        }
        System.out.println(sum);

    }
}
