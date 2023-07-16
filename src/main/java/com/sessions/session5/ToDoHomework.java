package com.sessions.session5;

import java.util.Scanner;
import java.util.WeakHashMap;

public class ToDoHomework {
    public static void main (String[] args){

        //1. A program that prints the alphabet and then converts the String into a StringBuilder
        // to use the reverse method to print the reversed alphabet.
//        String alphabet = "";
//        for (char c = 'a'; c<='z'; c++){
//            alphabet += c + " ";
//        }
//        alphabet = alphabet.trim();
//        System.out.println("The alphabet is: ");
//        System.out.println(alphabet);
//
//        StringBuilder alphabetReversed = new StringBuilder(alphabet);
//        alphabetReversed.reverse();
//        System.out.println("And the alphabet reversed is: ");
//        System.out.println(alphabetReversed);



        //2. A program that prints the alphabet reversed.
//        String alphabetReversed = "";
//        for(char c = 'z'; c >= 'a'; c--){
//            alphabetReversed += c + " ";
//        }
//        System.out.println("The alphabet reversed is: ");
//        System.out.println(alphabetReversed);



        //3. A program that prints all odd numbers from 0 to 100.
//        int num;
//        System.out.println("The odd numbers from 0 to 100 are: ");
//        for(int i = 1; i<=100; i+=2){
//            num = i;
//            System.out.println(num);
//            }



        //4. A program that checks if a word is palindrome or not.
        //Examples of palindromes: ana, racecar, civic, radar, level, rotor, kayak, madam, refer.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a word to check if it is a palindrome or not: ");
//        String word = scanner.nextLine();
//        StringBuilder sbword = new StringBuilder(word);
//        sbword.reverse();
//        String sbString = sbword.toString();
//
//        if(word.equalsIgnoreCase(sbString)){
//            System.out.println("The word " + word+ " is a palindrome");
//        }else {
//            System.out.println("The word "+ word+ " is not a palindrome");
//        }



        //5. A program that finds all numbers between 100 and 200 which are divisible by 9 and then calculates their sum.
//        int num = 0;
//        for(int i = 101; i < 200; i++){
//            if(i % 9 == 0){
//                System.out.println("The number " + i + " is divisible with 9");
//                num +=i;
//            }
//        }
//        System.out.println("And the sum of all those numbers is: " + num);



        //6. A program that lets the user to enter numbers and decide when to stop. Then it return the smallest and the largest number typed by the user.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a number (type 'done' to finish): ");
//        int smallerNum = Integer.MAX_VALUE;
//        int largestNum = Integer.MIN_VALUE;
//
//        while (true){
//            System.out.print(": ");
//            String input = scanner.nextLine();
//
//            if(input.equalsIgnoreCase("done")){
//                break;
//            }
//            try {
//                int number = Integer.parseInt(input);
//
//                if (number > largestNum) {
//                    largestNum = number;
//                }
//                if (number < smallerNum) {
//                    smallerNum = number;
//                }
//            }
//            catch (NumberFormatException e){
//                System.out.println("Invalid input.");
//            }
//        }
//        System.out.println("The largest number is: " + largestNum);
//        System.out.println("The smallest number is: " + smallerNum);




        }

    }

