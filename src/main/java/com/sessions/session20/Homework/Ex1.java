package com.sessions.session20.Homework;

import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        //Write a Java program that asks the user for two numbers and attempts to divide them. Use try-catch to handle the case where division by zero occurs.

        int firstNumber;
        int secondNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        firstNumber = input.nextInt();
        secondNumber = input.nextInt();
        try {
            int dividedNumbers = (firstNumber / secondNumber);
        }catch (ArithmeticException e) {
            System.out.println("Inside catch block - arithmetic exception");
        }
    }
}
