package com.sessions.session21.challenges;

import java.util.Optional;
import java.util.Scanner;

/**
 * <h1>Challenge 4</h1>
 * <p>Create a program to verify a person's age using exception handling.</p>
 *
 * <p><b>Requirements:</b>
 * <ul>
 *     <li>Create a custom checked exception called {@code InvalidAgeException} that extends {@link Exception}.</li>
 *     <li>Create a method called {@code validateAge} that takes an integer age as a parameter and
 *     throws the {@code InvalidAgeException} if {@code 150 < age < 0}.</li>
 *     <li>In the main method, prompt the user to enter their age and read the input.</li>
 *     <li>Use a try-catch block to handle the {@code InvalidAgeException} and display an appropriate
 *     error message if the exception occurs.</li>
 * </ul></p>
 */
public class ExceptionChallenge04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = 0;
        try {
            while (true) {
                System.out.print("Please enter your age [0<age<150]: ");
                if (sc.hasNextInt()) {
                    age = sc.nextInt();
                    //validateAge(age, "Age exception.");
                    validateAgeB(age);
                    break;
                }
                else sc.next();
            }
        }
        catch (InvalidAgeExceptionA | InvalidAgeExceptionB e) {
            System.out.println("Exception message: " + e.getMessage());
        }
        finally {
            System.out.printf("Your are %d %s old.", age, (age == 1 ? "year" : "years"));
        }
    }

    private static void validateAgeA(int age, String message) throws InvalidAgeExceptionA, InvalidAgeExceptionB  {
        if (age < 0 || age > 150) throw new InvalidAgeExceptionA(message);
    }

    private static void validateAgeA(int age) throws InvalidAgeExceptionA, InvalidAgeExceptionB {
        if (age < 0 || age > 150) throw new InvalidAgeExceptionA();
    }

    private static void validateAgeB(int age) throws InvalidAgeExceptionA, InvalidAgeExceptionB {
        if (age < 0 || age > 150) throw new InvalidAgeExceptionB();
    }
}

class InvalidAgeExceptionA extends Exception {

    // === Using constructors to pass the default message ===
    public InvalidAgeExceptionA() {
        super("Age should be an integer between 0 and 150 (inclusive limits).");
    }
    public InvalidAgeExceptionA(String message) {
        super(message);
    }
}

class InvalidAgeExceptionB extends Exception {

    // === Overriding getMessage() to pass the default message ===

    // === Optionals approach ===
    @Override
    public String getMessage() {
        Optional opResult = Optional.ofNullable(super.getMessage()).map(s -> s);
        return opResult.isPresent()
                ? opResult.toString()
                : "Age should be an integer between 0 and 150 (inclusive limits).";

    // === Classic approach ===
//        String sResult = super.getMessage();
//        return sResult == null || sResult.isEmpty()
//                ? "Age should be an integer between 0 and 150 (inclusive limits)."
//                : sResult;

    }

}
