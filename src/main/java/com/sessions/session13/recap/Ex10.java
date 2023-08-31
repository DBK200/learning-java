package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex10 {

    //Write a program that prompts the user to enter a number and calculates the
    // factorial of that number using a for loop.
    // Print out the factorial of the number.

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        long factorial = 1;

        for (int i = 1; i <= input; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
