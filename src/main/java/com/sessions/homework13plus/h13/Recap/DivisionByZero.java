package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;

public class DivisionByZero {

    public static void main(String[] args) {
        // Scenario : Division by Zero: Write a program that divides two int values. What happens if the second value is zero? How can you handle this scenario?


        // Trying to divide by zero will result in an Arithmetic Exception. To avoid this scenario I would check before the division :
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("We'll divide a/b \n Insert a: ");
        a = scanner.nextInt();
        System.out.println("Insert b: ");
        b = scanner.nextInt();

        if (b == 0) {
            System.out.println("B can't be zero!");
        } else {
            System.out.println("a/b = " + a + "/" + b + " = " + a / b);
        }


    }
}
