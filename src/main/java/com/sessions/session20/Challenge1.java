package com.sessions.session20;

import java.util.Scanner;

public class Challenge1 {
    //Write a Java program that asks the user for two numbers and attempts to divide them.
    // Use try-catch to handle the case where division by zero occurs.
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int input1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int input2 = scanner.nextInt();

        try {
            int result = input1 / input2;
            System.out.println("Result: " + result);
        }catch (ArithmeticException e){
            System.out.println("Can't divide by 0");
        }



    }
}
