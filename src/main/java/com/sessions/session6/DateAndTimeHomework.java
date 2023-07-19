package com.sessions.session6;

import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;
import java.util.Timer;

public class DateAndTimeHomework {
    public static void main(String[] args) {

        //1. Display today`s date

//        LocalDate todayDate = LocalDate.now();
//        System.out.println(todayDate);


        //2. Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day)

//        LocalDate localDate = LocalDate.now();
//        String formattedLocalDate = localDate.format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
//        System.out.println(formattedLocalDate);


        //3. Checking if today is 2019-12-22

//        LocalDate todayDate = LocalDate.now();
//        LocalDate checkDate = LocalDate.of(2019, 12, 22);
//        boolean datesCompared = todayDate.equals(checkDate);
//        System.out.println("Is today 2019-12-22?\n" + datesCompared);


        //4. Judging whether two dates read from console are equal

//        Scanner scanner = new Scanner(System.in);
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        boolean validInput1 = true;
//        boolean validInput2 = true;
//        LocalDate localDate = null;
//        LocalDate localDate1 = null;
//
//        while (validInput1) {
//            try {
//                System.out.println("Enter your first date: (yyyy-MM-dd)");
//                String firstDate = scanner.nextLine();
//                localDate = LocalDate.parse(firstDate, timeFormatter);
//                validInput1 = false;
//            } catch (DateTimeException e) {
//                System.out.println("Invalid input");
//            }
//        }
//
//            while (validInput2) {
//                try {
//                    System.out.println("Enter your second date: (yyyy-MM-dd)");
//                    String secondDate = scanner.nextLine();
//                    localDate1 = LocalDate.parse(secondDate, timeFormatter);
//                    validInput2 = false;
//                } catch (DateTimeException e) {
//                    System.out.println("Invalid input");
//                }
//            }
//
//                if (localDate.isEqual(localDate1)) {
//                    System.out.println("The dates you entered are equal");
//                } else if (localDate.isBefore(localDate1)) {
//                    System.out.println("The first date is before the second one");
//                } else if (localDate.isAfter(localDate1)) {
//                    System.out.println("The first date you entered is after the second one");
//                }


        //5. Write a method that prints local time with the following format HH:mm:ss

//        LocalTime time = LocalTime.now();
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
//        String timeFormatted = time.format(timeFormatter);
//        System.out.println(timeFormatted);


        //6. Write a method that calculates your age based on your birthday. The date of birth must be read from the console

//        Scanner scanner = new Scanner(System.in);
//        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
//        boolean validinput = true;
//        LocalDate birthdayFormatted = null;
//
//        while (validinput) {
//            try {
//                System.out.println("Enter your birthday: (yyy-MM-dd)");
//                String birthday = scanner.nextLine();
//                birthdayFormatted = LocalDate.parse(birthday, timeFormatter);
//                validinput = false;
//            }catch (DateTimeException e){
//                System.out.println("Invalid date");
//            }
//        }
//        LocalDate localDate = LocalDate.now();
//        Period age = Period.between(birthdayFormatted, localDate);
//        int years = age.getYears();
//        int months = age.getMonths();
//        int days = age.getDays();
//        System.out.println("You are "+ years + " years, " +  months + " months, and " +  days + " days old.");
    }
}
