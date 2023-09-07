package com.sessions.homework13plus.h13.Recap;

import java.util.Scanner;

public class BooleanLogic {


    public static void main(String[] args) {
        // Scenario : Write a program that prompts the user to enter two boolean values.
        // Use logical operators (&&, ||, !) to perform various operations on the values, such as AND, OR, and NOT.

        System.out.println("Answer with TRUE or FALSE");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Are you Skynet?");
        boolean answer1 = scanner.nextBoolean();
        System.out.println("Do you know the meaning of life?");
        boolean answer2 = scanner.nextBoolean();

        if (answer1 && !answer2) {
            System.out.println("You might be Skynet ");
        }
        if (answer1 || answer2) {
            System.out.println("You lied somewhere");
        }
        if (answer1 && answer2) {
            System.out.println("You certainly are Skynet");
        }
        if (!answer1 || !answer2) {
            System.out.println("You are pretending to be human.");
        }


    }
}
