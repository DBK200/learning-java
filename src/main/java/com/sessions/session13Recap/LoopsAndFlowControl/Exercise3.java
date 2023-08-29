package com.sessions.session13Recap.LoopsAndFlowControl;

public class Exercise3 {
    public static void main(String[] args) {
        //Write a program that prompts the user to enter a number and calculates the factorial of that number using a for loop. Print out the factorial of the number.

        int i, fact = 1;
        int number = 5;
        for( i = 1; i <= number; i++){
            fact =fact*i;
        }
        System.out.println("Factorial of "+number+ " is " +fact);
    }
}
