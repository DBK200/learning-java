package com.sessions.session5;

import java.util.Scanner;

public class ToDoExercises {
    public static void main(String[] args) {

        //1. Write a program to print all alphabets from a to z
        System.out.println("all alphabets from a to z: ");
        for (int i = 97; i <= 122; i++) {
            System.out.println((char)i);
        }

        //2. Write a program to print reverse alphabets from Z to A
        System.out.println("reverse alphabets from Z to A: ");
        for (int i = 90; i >= 65; i--) {
            System.out.println((char)i);
        }

        //3. Write a program to print all odd number between 1 and 100
        System.out.println("all odd number between 1 to 100: ");
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }

        //4. Write a Program to Check Given String is a Palindrome or Not
        Scanner input = new Scanner(System.in);
        System.out.println("enter the string to check if it is a palindrome: ");
        String str = input.nextLine();
        boolean isPalindrome = true;
        int mirrorIndex = str.length() - 1;
        for (int i = 0; i <= str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(mirrorIndex)) {
                isPalindrome = false;
                break;
            }
            mirrorIndex--;
        }
        System.out.println("is palindrome: " + isPalindrome);

        //5. Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
        int number = 0, sum = 0;
        for (int i = 100; i <= 200; i++) {
            if (i % 9 == 0) {
                number++;
                sum += i;
            }
        }
        System.out.println("number of all integer between 100 and 200 which are divisible by 9: ");
        System.out.println(number);
        System.out.println("sum of all integer between 100 and 200 which are divisible by 9: ");
        System.out.println(sum);

        //6. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered.
        int largest = 0, smallest = Integer.MAX_VALUE;
        int exit;
        System.out.println("enter numbers and 0 to exit:");
        do {
            Scanner numberEntered = new Scanner(System.in);
            exit = Integer.parseInt(numberEntered.nextLine());
            if (largest < exit) {
                largest = exit;
            }
            if (smallest > exit && exit != 0) {
                smallest = exit;
            }
        } while (exit != 0);
        System.out.println("smallest number: " + smallest);
        System.out.println("largest number: " + largest);
    }
}
