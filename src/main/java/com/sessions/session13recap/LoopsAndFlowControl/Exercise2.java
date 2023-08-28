package com.sessions.session13recap.LoopsAndFlowControl;

import java.util.Scanner;

public class Exercise2 {
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a day: ");
        String input = scanner.next();
        System.out.println(isWeekDay(input));
    }
}
