package com.sessions.session5;

import java.util.Scanner;

public class StringHomework
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println();

        //Exercise 1
        displayLowerLettersOfAlphabet();

        System.out.println();

        //Exercise 2
        String reversedAlphabet = displayUpperLettersOfAlphabet();

        System.out.println("The reversed upper latin alphabet letters are: " + reversedAlphabet);

        System.out.println();

        //Exercise 3
        displayOddNumbers();

        System.out.println();

        //Exercise 4
        System.out.print("Enter a string which you want to check if it's a palindrome or not: ");

        String readedString = readString(scanner);

        if (isPalindrome(readedString))
        {
            System.out.println("String is palindrome!");
        }

        else
        {
            System.out.println("String is not palindrome!");
        }

        //Exercise 5
        int sum = sumOfNumbers();

        System.out.println("Sum of numbers between 100 and 200 which are divided by 9 is: " + sum);

        System.out.println();

        //Exercise 6
        enterNumbersTillUserWants(scanner);

        scanner.close();
    }

    private static void displayLowerLettersOfAlphabet()
    {
        System.out.print("The lower letters of the latin alphabet are: ");

        for (char character = 'a'; character <= 'z'; character++)
        {
            System.out.print(character + " ");
        }

        System.out.println();
    }

    private static String displayUpperLettersOfAlphabet()
    {
        StringBuilder upperLetters = new StringBuilder();

        for (char character = 'Z'; character >= 'A'; character--)
        {
            upperLetters.append(character);
            upperLetters.append(' ');
        }
        return upperLetters.toString();
    }

    private static void displayOddNumbers()
    {
        System.out.print("The odd numbers between 1 and 100 are: ");

        for (int j = 1; j < 100; j += 2)
        {
            System.out.print(j + " ");
        }

        System.out.println();
    }

    private static String readString(Scanner scanner)
    {
        return scanner.nextLine();
    }

    private static boolean isPalindrome(String givenString)
    {
        StringBuilder stringBuilder = new StringBuilder(givenString);

        return givenString.equalsIgnoreCase(stringBuilder.reverse().toString());
    }

    private static int sumOfNumbers()
    {
        int sum = 0;

        System.out.println();
        System.out.print("Numbers between 100 and 200 which are divided by 9 are: ");

        for (int j = 100; j <= 200; j++)
        {
            if (j % 9 == 0)
            {
                System.out.print(j + " ");
                sum += j;
            }
        }

        System.out.println();

        return sum;
    }

    private static void enterNumbersTillUserWants(Scanner scanner)
    {
        int maximum = 0;
        int minimum = 0;

        System.out.println("If you want to quit the aplication press Ctrl + D");

        while (scanner.hasNextInt())
        {
            int number = scanner.nextInt();

            if (number > maximum)
            {
                maximum = number;
            }

            if (number < minimum)
            {
                minimum = number;
            }
        }

        System.out.println("The biggest number introduced by user is: " + maximum);
        System.out.println("The smaller number introduced by user is: " + minimum);
    }
}