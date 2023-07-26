/*

   Challenges with LocalDate and LocalDateTime
   [X]  1  Display today's date
   [X]  2  Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day)
   [X]  3  Check if today is 2019-12-22
   [X]  4  Judging whether two dates read from console are equal
   [X]  5  Write a method that prints local time with the following format HH:mm:ss
   [X]  6  Write a method that calculates your age based on your birthday.
           The date of birth must be read from the console.
           (you can use Period object to compare the date of birth with current date)

*/

package com.sessions.session6;

import java.io.FilterInputStream;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class DateTimeChallenges {
    public static void main(String[] args) {

        /*-------------------
         |  Exercise no. 1  |
         -------------------*/

        System.out.printf("%s%n%n", "== Exercise no. 1 " + "=".repeat(2));

        // Gets the ZoneId for Bucharest
        ZoneId zoneHome = ZoneId.of("Europe/Bucharest");

        // Gets current date corresponding to ZoneId
        LocalDate dateHome = LocalDate.now(zoneHome);
        // ... and current time
        LocalTime timeHome = LocalTime.now(zoneHome);

        // Print out
        System.out.println("Current local (Home) date is: " + dateHome
                + "\nCurrent local (Home) time is: " + timeHome);

        // Print out without variable declarations
        System.out.println("Current local (Custom) date is: " + LocalDate.now(ZoneId.of("Europe/London"))
                + "\nCurrent local (Custom) time: " + LocalTime.now(ZoneId.of("Europe/London")));

        System.out.printf("%n%s%n", "=".repeat(20));

        /*-------------------
         |  Exercise no. 2  |
         -------------------*/
        System.out.printf("%n%s%n%n", "== Exercise no. 2 " + "=".repeat(2));

        System.out.println("1. " + customDateFormat("9/17/2023"));
        System.out.println("2. " + customDateFormat("19/07/2023"));

        System.out.printf("%n%s%n", "=".repeat(20));

        /*-------------------
         |  Exercise no. 3  |
         -------------------*/
        System.out.printf("%n%s%n%n", "== Exercise no. 3 " + "=".repeat(2));

        System.out.println("Today is 2019-12-22 returned: " +
                LocalDate.now().isEqual(LocalDate.parse("2019-12-22")));

        System.out.printf("%n%s%n", "=".repeat(20));

        /*-------------------
         |  Exercise no. 4  |
         -------------------*/
        System.out.printf("%n%s%n%n", "== Exercise no. 4 " + "=".repeat(2));

        // Comment the next call if you want to run Exercise no. 6
        // !!!!
        // Solved it by eliminating the "scanner.close()" call
        // !!!!
        compareDates();
        // ==================================================
        // After executing this method,
        // the next one using the Scanner has weird behaviour
        // !!!!
        // Solved it by eliminating the "scanner.close()" call
        // !!!!
        // ==================================================

        System.out.printf("%n%s%n", "=".repeat(20));

        /*-------------------
         |  Exercise no. 5  |
         -------------------*/
        System.out.printf("%n%s%n%n", "== Exercise no. 5 " + "=".repeat(2));

        System.out.printf("Non-formatted local time is %s%n", LocalTime.now());
        System.out.printf("Formatted local time is %s%n", customTimeFormat());

        System.out.printf("%n%s%n", "=".repeat(20));

        /*-------------------
         |  Exercise no. 6  |
         -------------------*/
        System.out.printf("%n%s%n%n", "== Exercise no. 6 " + "=".repeat(2));

        // ====================================================
        // Calling twice the Scanner makes this weird behaviour
        // in which it's not stopping to get some input.
        // !!!!
        // Solved it by eliminating the "scanner.close()" call
        // !!!!
        // ====================================================
        getAge();

        System.out.printf("%n%s%n", "=".repeat(20));
    }

    private static String customDateFormat(String sDate) {
        // Initial validation
        // Because [sDate] argument should be of type "dd.MM.yyyy",
        // changes separators into '.'
        String sResult = sDate.replaceAll("[^0-9-]","-");

        try {
            // Gets the date from [sDate] string
            // [dateResult] will have Java's native format "yyyy-M-d"
            LocalDate dateResult = LocalDate.parse(sResult,
                    DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            // Method output with requested date format
            return "Input date: " + sDate + "\n" +
                    "[MM-yyyy-dd] formatted date is: " +
                    dateResult.format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        }
        catch (DateTimeParseException e) {
            return "Wrong input date ["+ sDate +"]!\nInput date has to have the following succession: Day, Month and Year!";
        }

    }

    private static void compareDates() {

        // Scanner initialising
        //Scanner sc = new Scanner(System.in);
        Scanner sc = new Scanner(new FilterInputStream(System.in){public void close(){}});

        // Input message
        System.out.print("Please enter next two dates for comparison [yyyy-MM-dd]: ");

        try {
            // Dates storage variable
            StringBuilder sbDates = new StringBuilder();

            // Counter initialisation
            int n = 0;

            while (n < 2) {
                if (sc.hasNext()) {
                    sbDates.append( (sbDates.length() == 0) ? sc.next() : "|" + sc.next() );
                    n++;
                }
            }
            // Skips to next line
            sc.nextLine();
            // Closes the scanner
            sc.close();

            // Uses [n] variable for storing separator index position
            n = sbDates.indexOf("|");
            LocalDate dateFirst = LocalDate.parse(sbDates.substring(0,n).replaceAll("[^0-9-]","-"));
            LocalDate dateSecond = LocalDate.parse(sbDates.substring(n+1).replaceAll("[^0-9-]","-"));

            System.out.printf("The statement \"%tF is the same with %tF\" returned: %b%n",
                    dateFirst, dateSecond, dateFirst.isEqual(dateSecond));
        }
        catch (Exception e) {//DateTimeParseException e) {
            System.out.println("Wrong input date!\nInput date has to have Java's native format yyyy-M-d.");
        }

    }
    private static String customTimeFormat() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));
    }

    private static void getAge() {
        try {
            // Scanner initialising
            Scanner sc = new Scanner(System.in);

            // Input message
            System.out.print("Please enter your birth date [yyyy-MM-dd]: ");

             // Birthdate storage variable with some validation applied
            LocalDate dateBDate = LocalDate.parse(sc.nextLine().replaceAll("[^0-9-]","-"));

            // Closes the scanner
            sc.close();

            Period periodAge = Period.between(dateBDate, LocalDate.now());
            int iYears = periodAge.getYears();
            int iMonths = periodAge.getMonths();
            int iDays = periodAge.getDays();

            // Method output takes into account if entered birthdate
            // is before current date, otherwise returns an
            // implausible input date message
            System.out.println( (dateBDate.isBefore(LocalDate.now())) ?
                    "You are " + iYears + " years " + iMonths + " months and " + iDays + " days old" :
                    "ERROR: Implausible birthdate input!" );
        }
        catch (DateTimeParseException e) {
            System.out.println("Wrong input date!\nInput date has to be yyyy-MM-dd.");
        }
    }

}
