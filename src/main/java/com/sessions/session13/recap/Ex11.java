package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex11 {

    //Write a program that prompts the user to enter a number and checks if it is a prime number using a while loop.
    // Print out a message indicating whether the number is prime or not.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        if (input <= 1){
            System.out.println("The number is not a prime");
        }
        for (int i = 2; i <= Math.sqrt(input); i++) {
            if (input % i == 0) {
                System.out.println("The number is not a prime");
            } else {
                System.out.println("The number " + input + " is prime");
                break;
            }
        }

    }
}
