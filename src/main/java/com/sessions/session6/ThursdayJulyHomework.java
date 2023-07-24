package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class ThursdayJulyHomework {
    public static void main(String[] args) {

        System.out.println("***** exercise 1 - display today's date *****");
        LocalDate dateNow = LocalDate.now();
        System.out.println("Today's date is: " + dateNow);

        System.out.println("***** exercise 2 - write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day) *****");
        LocalDate date = LocalDate.of(2005, 12, 20);
        String dateAsString = date.format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        System.out.println(dateAsString);

        System.out.println("***** exercise 3 - checking if today is 2019-12-22 *****");
        LocalDate anotherDate = LocalDate.of(2019, 12, 22);
        boolean areDatesEqual = dateNow.isEqual(anotherDate);
        System.out.println("Dates are equal: " + areDatesEqual);

        System.out.println("***** exercise 4 - judging whether two dates read from console are equal *****");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter date 1 in the format DD-MM-YYYY:");
        String dateRead1 = scanner.nextLine();
        System.out.println("Enter date 2 in the format DD-MM-YYYY:");
        String dateRead2 = scanner.nextLine();
        LocalDate localDate1 = LocalDate.parse(dateRead1, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        LocalDate localDate2 = LocalDate.parse(dateRead2, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        if (localDate1.equals(localDate2)) {
            System.out.println("The 2 dates entered are the same.");
        } else {
            System.out.println("The 2 dates entered are not the same.");
        }

        System.out.println("***** exercise 5 - Write a method that prints local time with the following format HH:mm:ss *****");
        LocalTime myLocalTime = LocalTime.now();
        String myLocalTimeString = myLocalTime.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
        System.out.println(myLocalTimeString);

        System.out.println("***** exercise 6 - write a method that calculates your age based on your birthday; the date of birth must be read from the console *****");
        System.out.println("Please enter your date of birth in the format dd-MM-yyyy:");
        String dateOfBirth = scanner.nextLine();
        LocalDate localDateOfBirth = LocalDate.parse(dateOfBirth, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        Period period = Period.between(dateNow, localDateOfBirth);
        System.out.println("Your age is " + Math.abs(period.getYears()) + " years old.");
    }
}
