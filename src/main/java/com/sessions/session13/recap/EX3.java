package com.sessions.session13.recap;

public class EX3 {
    //Switch Statement: Write a program that prompts the user to enter
    // a day of the week and prints out a message indicating whether it is
    // a weekday or a weekend day, using a switch statement.

//    private static boolean isWeekDay(String day)
//    {
//        if(day.isBlank())
//            return false;
//        return switch(day.toUpperCase())
//        {
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> true;
//            default ->false;
//        };
//    }


    public static void main(String[] args)
    {
        String day="Saturday";
        System.out.println("day is a " +isWeekDay(day));
    }

    private static String isWeekDay(String day)
    {
        if(day.isBlank())
            return "Error";
        String sResult;
         switch(day.toUpperCase().replace(" ",""))
        {
            case "MONDAY" :
                sResult="Weekday";
                break;
            case "TUESDAY":
                sResult="Weekday";
                break;
            case "WEDNESDAY":
                sResult="Weekday";
                break;
            case "THURSDAY":
                sResult="Weekday";
                break;
            case "FRIDAY":
                sResult="Weekday";
                break;
            case "SATURDAY":
                sResult="Weekend day";
                break;
            case "SUNDAY":
                sResult="Weekend day";
                break;
            default :
                sResult="Not a day";
        }
        return sResult;
    }



}
