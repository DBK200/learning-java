package com.sessions.session12.Exercises.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise2 {
        //Write a program that prompts the user to enter a day of the week and prints out a message indicating whether it is a weekday or a weekend day, using a switch statement.
        private static String isWeekDay(String day) {
            if (day.isBlank()) {
                return "Error";
            }
            String sResult;
            switch (day.toUpperCase()) {
                case "MONDAY":
                case "TUESDAY":
                case "WEDNESDAY":
                case "THURSDAY":
                case "FRIDAY":
                    sResult = "WeekDay";
                    break;
                case "SATURDAY":
                case "SUNDAY":
                    sResult = "Weekend day";
                    break;
                default:
                    sResult = "Not a day";
                    break;
            }
            return sResult;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a day");
        String enterADay = input.next();
        System.out.println(isWeekDay(enterADay));
    }
}

