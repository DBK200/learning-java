package com.sessions.session13recap.JavaBasics1;
import java.util.Scanner;

public class Exercise6 {

    public static boolean checkIfBoolean(String input) {
        if ("true".equalsIgnoreCase(input)) {
            return true;
        } else if ("false".equalsIgnoreCase(input)) {
            return false;
        } else {
            System.out.println("Invalid input entered. Only true or false is allowed.");
        }
        return false;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a boolean value (true or false): ");
        String input1 = scanner.next();
        System.out.println("Enter the second boolean value (true or false): ");
        String input2 = scanner.next();
        boolean inputAsBoolean1 = checkIfBoolean(input1);
        boolean inputAsBoolean2 = checkIfBoolean(input2);

        System.out.println("!value1 entered: " + !inputAsBoolean1);
        System.out.println("!value2 entered: " + !inputAsBoolean2);
        System.out.println("value1 || value2: " + (inputAsBoolean1 || inputAsBoolean2));
        System.out.println("value1 && value2: " + (inputAsBoolean1 && inputAsBoolean2));
    }
}
