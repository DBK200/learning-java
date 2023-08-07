package com.sessions.session5;

import java.util.Scanner;

public class StringBuilderTema {
    public static void main(String[] args) {
        //Write a program to print all alphabets from a to z
        for (int a = 97; a <= 122; a++) {

            System.out.println((char) (a));

            // Write a program to print reverse alphabets from Z to A
            for (int i = 90; i >= 65; i--) {
                System.out.print((char) (i) + " ");
            }
            //Write a program to print all odd number between 1 to 100
            for (int i = 1; i <= 100; i++) {
                if (i % 2 != 0) {
                    System.out.print(i + " ");
                }

                //Write a Program to Check Given String is a Palindrome or Not
                String word = "Level";
                String palindromeWord = "";
                for (int b = word.length() - 1; b >= 0; b--) {
                    palindromeWord += word.charAt(i);
                }
                boolean isPalindrome = palindromeWord.equalsIgnoreCase(word);
                System.out.println(isPalindrome);
                System.out.println(palindromeWord);

                // Write a program to find number and sum of all integer between 100 and 200 which are divisible by 9
                int sum = 0;
                for (int c = 100; c <= 200; c++) {
                    if (c % 9 == 0) {
                        sum += c;
                    }
                }
                System.out.println(sum);

        /*
        enter number till user wants
        hte program should display the smallest and largest number
         */
                Scanner input = new Scanner(System.in);
                System.out.println("Enter how many numbers you want: ");
                int numbers = input.nextInt();
                int smallest = Integer.MAX_VALUE;
                int largest = Integer.MIN_VALUE;

                while (numbers > 0) {
                    int number = input.nextInt(); // 4, 2, 6
                    if (number <= smallest) {
                        smallest = number; //2
                    }
                    if (number >= largest) {
                        largest = number;

                    }
                    numbers--;
                }
                System.out.println("Smallest number is: " + smallest);
                System.out.println("Largest number is: " + largest);

            }
        }
    }
}