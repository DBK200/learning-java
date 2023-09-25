package com.sessions.session20;


import java.util.Scanner;

public class AgeValidationChallenge {
    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your age: ");
            int age = scanner.nextInt();
            validateAge(age);
            System.out.println("Your age is: " + age);
        }catch (InvalidAgeException e){
            System.out.println("Invalid age " + e.getMessage());
        }

    }
    public static void validateAge(int age) throws InvalidAgeException{
        if (age < 0 || age > 150){
            throw new InvalidAgeException("Age must be valid");
        }
    }

}
class InvalidAgeException extends Exception{
    public InvalidAgeException(String message){
        super(message);
    }
}
