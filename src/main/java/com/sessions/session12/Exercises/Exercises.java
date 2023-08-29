package com.sessions.session12.Exercises;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exercises {
    //Division by Zero: Write a program that divides two int values. What happens if the second value is zero? How can you handle this scenario?
    public static int divide(int a, int b) {
////        if (b == 0){
////            System.out.println("Division by 0");
////            return 0;
//        }


        try {
            return a / b;
        } catch (ArithmeticException exception) {
            System.out.println("Division by zero");
        }
        return 0;
    }


    public static void main(String[] args) {

        //Write a program that prompts the user to enter a number and calculates the sum of the digits of that number using a do-while loop. Print out the sum of the digits.
//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        int i = input.nextInt();
//        int sum = 0;
//        do {
//            sum += i;
//            i++;
//        } while (i <= 2);
//        System.out.println(sum);

        //Write a program that prompts the user to enter a string and prints out the length of the string.



//        System.out.println(divide(3, 1));

        //Type Casting: Declare a variable of one data type, and then assign it to a variable of another data type using type casting. For example,
        // declare a double variable and assign it to an int variable using type casting.
        // Print out the value of the int variable to verify that the type casting was successful.

//        double number = 5.2;
//        int integerNumber = (int) number;
//
//        int nr = 6;
//        float x = (float) nr;
//        System.out.println("The initial number is: " + number);
//        System.out.println("The value casted to int is: " + integerNumber);
//
//        System.out.println("The initial number is: " + nr);
//        System.out.println("The initial number is: " + x);

        //Switch Statement:
        // Write a program that prompts the user to enter a day of the week and prints out a message indicating whether it is a weekday or a weekend day, using a switch statement.


//        String day = "Monday";
//        System.out.println("day is a " + isWeekDay(day));

        //Integer Overflow: Write a program that multiplies two int values and stores the result in an int.
        // What happens if the result is larger than the maximum int value? How can you handle this scenario?

//        int a = 29;
//        int b = 3654;
//        int c = a * b;
//        System.out.println(c);

        //Write a program that prompts the user to enter a number and checks if it is a prime number using a while loop. Print out a message indicating whether the number is prime or not.

//


        //String to Integer: Write a program that prompts the user to enter a string representing an integer value.
        // Convert the string to an int using the Integer.parseInt() method. What happens if the string cannot be parsed as an integer? How can you handle this scenario?

//        String str = "111t";
//
//
//        try {
//
//            int num1 = Integer.parseInt(str);
//            System.out.println(num1);
//        } catch (NumberFormatException ex) {
//            System.out.println("NumberFormat Exception: invalid input string");
//        }
//        System.out.println("Continuing execution...");


        //Char to Int Conversion: Write a program that prompts the user to enter a single character.
        // Convert the character to its corresponding int value using the Character.getNumericValue() method.
        // What happens if the character is not a numeric digit? How can you handle this scenario?

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a number");
//        char num = input.next().charAt(0);

        //Floating Point Precision: Write a program that calculates the average of three floating-point numbers.
        // What happens if the sum of the three numbers exceeds the maximum value that can be represented by a float? How can you handle this scenario?

//        double av1 = 1854.5;
//        double av2 = 794564.4;
//        double av3 = 6543434.5;
//        double average = av1 + av2 + av3 / 3;


        //Write a program that prompts the user to enter a day of the week and prints out a message indicating whether it is a weekday or a weekend day, using a switch statement.

//        Scanner input = new Scanner(System.in);
//        System.out.println("Enter a day");
//        int day = input.nextInt();
//        System.out.println(getDayName(day));


//        public static String getDayName ( int day){
//            String dayOfWeek = "";
//            switch (day) {
//                case 1:
//                    dayOfWeek = "Monday";
//                    break;
//                case 2:
//                    dayOfWeek = "Tuesday";
//                    break;
//                case 3:
//                    dayOfWeek = "Wednesday";
//                    break;
//                case 4:
//                    dayOfWeek = "Thursday";
//                    break;
//                case 5:
//                    dayOfWeek = "Friday";
//                    break;
//                case 6:
//                    dayOfWeek = "Saturday";
//                    break;
//                case 7:
//                    dayOfWeek = "Sunday";
//                default:
//                    dayOfWeek = "Invalid day range";
//
//            }
//
//            return dayOfWeek;
//        }
//    }
    }
}








//    private static String isWeekDay(String day) {
//        String sResult;
//        switch (day.toUpperCase()) {
//            case "MONDAY":
//            case "TUESDAY":
//            case "WEDNESDAY":
//            case "THURSDAY":
//            case "FRIDAY":
//                sResult = "Weekday";
//                break;
//            case "SATURDAY":
//            case "SUNDAY":
//                sResult = "Weekend day";
//                break;
//            default:
//                sResult = "Not a day";
//
//
//        }
//        return sResult;






