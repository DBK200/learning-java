package com.sessions.session6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TimeHomework
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        System.out.println();
        displayTodaysDate();

        //Exercise 2
        System.out.println();
        displayDateWithCustomFormat();

        //Exercise 3
        System.out.println();

        LocalDate date = LocalDate.of(2019,12,22);

        if(isTodaysDate(date))
        {
            System.out.println("Today is: " + date);
        }

        else
        {
            System.out.println("Today is: " + LocalDate.now());
        }

        //Exercise 4
        System.out.println("Enter the first date: ");
        LocalDate date1 = readDate(scanner);
        System.out.println("Enter the second date: ");
        LocalDate date2 = readDate(scanner);

        int resultOfComparing = comparingDates(date1, date2);

        System.out.println();

        if(resultOfComparing > 0)
        {
            System.out.println("First date " + date1 + " is after the second date " + date2);
        }
        else if(resultOfComparing < 0)
        {
            System.out.println("First date " + date1 + " is before the second date " + date2);
        }
        else
        {
            System.out.println("Dates are equal!");
        }

        //Exercise 5
        displayTimeWithCustomFormat();
    }

    private static void displayTodaysDate()
    {
        LocalDate localDate = LocalDate.now();

        System.out.println("Today's date is: " + localDate);
    }

    private static void displayDateWithCustomFormat()
    {
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("MM-yyyy-dd");
        LocalDate localDate = LocalDate.of(2004, 6, 1);

        System.out.println("The date with the required format is: " + localDate.format(customFormat));
    }

    private static boolean isTodaysDate(LocalDate date)
    {
        return date.equals(LocalDate.now());
    }

    private static LocalDate readDate(Scanner scanner)
    {
        System.out.print("Enter year's value: ");
        int year = scanner.nextInt();

        System.out.print("Enter month's value: ");
        int month = scanner.nextInt();

        System.out.print("Enter day's value: ");
        int day = scanner.nextInt();

        if (year < 0 || month <= 0 || month > 12 || day <= 0 || day > 31)
        {
            System.out.println("\nThe date entered is invalid. Re-enter.\n");

            return readDate(scanner);
        }

        System.out.println();

        return LocalDate.of(year, month, day);
    }

    private static int comparingDates(LocalDate date1, LocalDate date2)
    {
        return date1.compareTo(date2);
    }

    private static void displayTimeWithCustomFormat()
    {
        DateTimeFormatter customFormat = DateTimeFormatter.ofPattern("HH:ss:mm");
        LocalTime time = LocalTime.of(12, 13, 44);

        System.out.println();
        System.out.println("The time with the custom format is: " + time.format(customFormat));
        System.out.println();
    }

}