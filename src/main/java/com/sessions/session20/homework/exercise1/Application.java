package com.sessions.session20.homework.exercise1;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        /* Write a Java program that asks the user for two numbers and attempts to divide them. Use try-catch to handle
        the case where division by zero occurs. */

        int number1, number2, division = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.print("Primul numar: ");
        number1 = getNumberFromUser(scanner);
        System.out.print("Al doilea numar: ");
        number2 = getNumberFromUser(scanner);

        try {
            division =  number1 / number2;
        } catch (ArithmeticException exception) {
            System.out.println("You tried division by zero.");
        }

        System.out.println("Division result: " + division);
    }

    private static int getNumberFromUser(Scanner scanner) {
        int number;
        while (true) {
            try {
                number = Integer.parseInt(scanner.next());
                break;
            } catch (NumberFormatException exception) {
                System.out.print("Numarul introdus nu este un numar intreg. Reintrodu numarul: ");
            }
        }
        return number;
    }
}
