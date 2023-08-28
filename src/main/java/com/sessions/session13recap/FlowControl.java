package com.sessions.session13recap;

import java.util.Scanner;

public class FlowControl {
    static Scanner scanner = new Scanner(System.in);
    // Loops and flow-control

    // 1. Write a program that prompts the user to enter a number and checks if
    // it is even or odd using an if-else statement. Print out a message indicating
    // whether the number is even or odd.
//    private static String checkIfEven(int number){
//        if(number % 2 == 0){
//            return "Number " + number + " is even";
//        } else{
//            return "Number " + number + " is odd";
//        }
//    }

    // 2. Switch Statement: Write a program that prompts the user to enter a day of the week
    // and prints out a message indicating whether it is a weekday or a weekend day, using a switch statement.
//    private static String checkDay(String str){
//        String result = "";
//        switch(str){
//            case "Monday":
//            case "Tuesday":
//            case "Wednesday":
//            case "Thursday":
//            case "Friday":
//                result = "Week day";
//                break;
//            case "Saturday":
//            case "Sunday":
//                result = "Weekend";
//                break;
//            default:
//                result = "Please enter a day of the week";
//                break;
//        }
//        return result;
//    }


    // 3. For loop: Write a program that prompts the user to enter a number and calculates the factorial of
    // that number using a for loop. Print out the factorial of the number.
//    private static int calculateFactorial(int number){
//        int factorial = 1;
//        for(int i=1; i<=number; i++){
//            factorial = factorial * i;
//        }
//        if(number == 0){
//            factorial = 0;
//        }
//        return factorial;
//    }

    // 4. While Loop: Write a program that prompts the user to enter a number and checks if it is a prime number
    // using a while loop. Print out a message indicating whether the number is prime or not.

//    private static boolean checkPrime(int number){
//        // 1 nu e nr prim
//        // un numar este prim daca se imparte numai la 1 si la el insusi
//        if(number <= 1){
//            return false;
//        }
//        int divisor = 2;
//       while(divisor <= Math.sqrt(number)){
//            if(number % divisor == 0){
//                return false;
//            }
//            divisor++;
//       }
//       return true;
//    }


    // 5. Do-While Loop: Write a program that prompts the user to enter a number and calculates the sum of the digits
    // of that number using a do-while loop. Print out the sum of the digits.
//    private static int sumOfDigits(int number){
//        int sumOfDigits = 0;
//        int lastDigit = 0;
//        do{
//            lastDigit = number%10;
//            sumOfDigits+=lastDigit;
//            number = number / 10;
//        } while(number >0);
//            return sumOfDigits;
//    }

    // 6. Break Statement: Write a program that prompts the user to enter a series of numbers until they enter a negative number.
    // Calculate the sum of the positive numbers using a break statement to exit the loop when a negative number is entered.
//    private static int sumOfPositives(){
//        int sum = 0;
//        System.out.println("Enter a series of numbers until a negative number: ");
//        while(true){
//            System.out.println("Enter a number: ");
//            int number = scanner.nextInt();
//            if(number < 0){
//                break;
//            }
//            sum+=number;
//        }
//        return sum;
//    }

    // 7. Continue Statement: Write a program that prompts the user to enter a series of numbers and calculates the sum of the
    // even numbers using a continue statement to skip over the odd numbers
    private static int sumOfEvenNumbers(){
        int sum = 0;
        System.out.println("Enter a series of numbers: ");
        while(true){
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if(number % 2 !=0){
                continue;    // continue to introduce numbers because the odd numbers are ignored
            }
            // Interrupt when 0 is introduced
            // Not asked but the series has to stop somewhere
            if(number == 0){
                break;
            }
                sum+=number;
        }
        System.out.println("Sum is: ");
        return sum;

    }
    public static void main(String[] args) {
      //  Scanner scanner = new Scanner(System.in);

        // Loops and flow-control
        // 1. Write a program that prompts the user to enter a number and checks if
        // it is even or odd using an if-else statement. Print out a message indicating
        // whether the number is even or odd.
//        System.out.println(checkIfEven(7));
//        System.out.println(18);

        // 2. Switch Statement: Write a program that prompts the user to enter a day of the week
        // and prints out a message indicating whether it is a weekday or a weekend day, using a switch statement.
//        System.out.println(checkDay("Andreea"));
//        System.out.println(checkDay("Monday"));
//        System.out.println(checkDay("Saturday"));

        // 3. For loop: Write a program that prompts the user to enter a number and calculates the factorial of
        // that number using a for loop. Print out the factorial of the number.
//        System.out.println("Introduce a number:");
//        int num = scanner.nextInt();
//        System.out.println("The factorial of " + num + " is " + calculateFactorial(num));

        // 4. While Loop: Write a program that prompts the user to enter a number and checks if it is a prime number
        // using a while loop. Print out a message indicating whether the number is prime or not.
//        System.out.println("Introduce a number:");
//        int num = scanner.nextInt();
//        System.out.println("The number " + num + " is prime: " + checkPrime(num));

        // 5. Do-While Loop: Write a program that prompts the user to enter a number and calculates the sum of the digits
        // of that number using a do-while loop. Print out the sum of the digits.
//        System.out.println("Introduce a number:");
//        int num = scanner.nextInt();
//        System.out.println("The sum of digits of " + num + " is: " + sumOfDigits(num));

        // 6. Break Statement: Write a program that prompts the user to enter a series of numbers until they enter a negative number.
        // Calculate the sum of the positive numbers using a break statement to exit the loop when a negative number is entered.
        //System.out.println(sumOfPositives());

        // 7. Continue Statement: Write a program that prompts the user to enter a series of numbers and calculates the sum of the
        // even numbers using a continue statement to skip over the odd numbers
        System.out.println(sumOfEvenNumbers());
    }
}
