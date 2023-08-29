package com.sessions.session12.Exercises.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {

        //Write a program that prompts the user to enter a number and calculates the sum of the digits of that number using a do-while loop. Print out the sum of the digits.
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int sum = input.nextInt();
        int i = 0;
        int n = 0;
        do{
            sum+= n % 10;
            n = n / 10;
        } while (n > 0);
    }
}
