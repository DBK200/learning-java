package com.sessions.session13.practice;

public class Recap {

    private static int divide(int a, int b) {
//        if (b == 0) {
//            return 0;
//        }
        try {
            return a / b;
        }
        catch (ArithmeticException e) {
            System.out.println(e.toString());
            return 0;
        }
    }



    public static void main(String[] args) {
//        System.out.println(divide(3,0));

/*
        Type Casting:
        Declare a variable of one data type, and then assign it to
        a variable of another data type using type casting.
        For example, declare a double variable and assign it to an int variable using type casting.
        Print out the value of the int variable t
*/

/*
        double d = 1.1;
        int i = (int) d;

        System.out.printf("d = %.1f and after casting  i = %d", d, i);
*/

/*
       Switch Statement:
       Write a program that prompts the user to enter a day of the week and prints out
       a message indicating whether it is a weekday or a weekend day, using a switch
       statement.
*/
       String day = "Mo    n   d a y";
        System.out.println("day is a " + isNewWeekWeekendDay(day));

    }

    private static String isWeekWeekendDay(String day) {
        if (day.isBlank()) return "Error: parameter is blank";

        return switch (day.toUpperCase()){
                case "MONDAY","TUESDAY","WEDNESDAY", "THURSDAY", "FRIDAY" -> "Weekday";
                case "SATURDAY", "SUNDAY" -> "Weekend day";
                default -> "Not a day";
                };

    }
    private static String isNewWeekWeekendDay(String day) {
        if (day.isBlank()) return "Error: parameter is blank";

        String sResult;

        switch (day.toUpperCase().replaceAll(" ", "")){
            case "MONDAY":
            case "TUESDAY":
            case "WEDNESDAY":
            case "THURSDAY":
            case "FRIDAY":
                sResult ="Weekday";
                break;
            case "SATURDAY":
            case "SUNDAY":
                sResult = "Weekend day";
                break;
            default:
                sResult = "Not a day";
        }

        return sResult;
    }
}
