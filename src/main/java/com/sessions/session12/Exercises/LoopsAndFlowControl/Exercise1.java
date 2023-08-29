package com.sessions.session12.Exercises.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        //Write a program that prompts the user to enter a number and checks if it is even or odd using an if-else statement.
        // Print out a message indicating whether the number is even or odd.

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        if(number % 2 == 0){
            System.out.println("Number is odd");
        }else {
            System.out.println("Number is even");
        }
    }
}
