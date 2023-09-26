package com.sessions.session21.Homework;

import java.util.Scanner;

public class Calculator
{
    /*
    Calculator

   Objective:
   Create a simple calculator that handles exceptions for invalid input and arithmetic errors.

   Requirements:
   Create a method called calculate that takes two double operands and a char operator as parameters.
   This method should perform the specified operation and return the result.
   Handle the following exceptions within the calculate method:
   ArithmeticException for division by zero.
   IllegalArgumentException for an invalid operator.
   In the main method, prompt the user to enter two numbers and an operator.
   Use a try-catch block to handle possible exceptions, such as NumberFormatException from invalid input,
   and any exceptions thrown by the calculate method.
   Display the result of the calculation or an appropriate error message based on the exception caught.
     */
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduceti primnul numar:");
        int a=scanner.nextInt();
        System.out.println("Introduceti al doilea nr:");
        int b=scanner.nextInt();
        System.out.println("Introduceti un caracter:");
        char c = scanner.next().charAt(0);
        try {
            double result = calculate(a, b, c);
            System.out.println("Rezultatul este: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Eroare aritmetică: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Eroare ilegală: " + e.getMessage());
        }

    }

    public static double calculate(double a,double b,char c)
    {
        switch (c) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0) {
                    throw new ArithmeticException("Nu se poate împărți la zero.");
                }
                return a / b;
            default:
                throw new IllegalArgumentException("Operator invalid: " + c);
        }
    }

}
