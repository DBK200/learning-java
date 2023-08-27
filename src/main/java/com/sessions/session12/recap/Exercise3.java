package com.sessions.session12.recap;

public class Exercise3 {

//    private static boolean isWeekDay(String day) {
//        if (day.isBlank()) {
//            return false;
//        }
//        return switch (day.toUpperCase()) {
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> true;
//            default -> false;};
//    }
//    private static String isWeekDay(String day) {
//        if (day.isBlank()) {
//            return "Error";
//        }
//        return switch (day.toUpperCase()) {
//            case "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY" -> "WeekDay";
//            case "SATURDAY", "SUNDAY" -> "Weekend day";
//            default -> "Not a day";};
//    }

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

    String day1 = "monday";
    System.out.println(isWeekDay(day1));

    String day2 = "buu";
    System.out.println(isWeekDay(day2));

    String day3 = "saturday";
    System.out.println(isWeekDay(day3));

    }
}
