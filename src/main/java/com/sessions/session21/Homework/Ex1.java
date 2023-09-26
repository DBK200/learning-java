package com.sessions.session21.Homework;

import java.util.Scanner;

public class Ex1
{
    /*
    Age Validation

    Objective:
    Create a program to verify a person's age using exception handling.

    Requirements:
    Create a custom checked exception called InvalidAgeException that extends Exception.
    Create a method called validateAge that takes an integer age as a parameter and throws
    the InvalidAgeException if the age is less than 0 or greater than 150.
    In the main method, prompt the user to enter their age and read the input.
    Use a try-catch block to handle the InvalidAgeException and display an appropriate error message if the exception occurs.

     */
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        try{
            System.out.println("Introduceti varsta:");
            int varsta=scanner.nextInt();
            validateAge(varsta);
            System.out.println("Varsta este:"+varsta);
        }catch (InvalidAgeException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public static void validateAge(int age) throws InvalidAgeException
    {
        if(age<0 ||age >150)
        {
            throw new InvalidAgeException("Varsta introdusa nu este valida,trebuie sa fie in intervalul 1-150");
        }

    }
}
