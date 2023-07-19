package com.sessions.session6;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ThursdayJulyHomework {
    public static void main(String[] args) {

        //1. Display today's date
        LocalDate dateNow = LocalDate.now();
        System.out.println("Today's date is: " + dateNow);

        //2. Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day)
        LocalDate date = LocalDate.of(2005, 12, 20);
        date.format(DateTimeFormatter.ofPattern("MM-yyyy-dd"));
        System.out.println(date);

        //3. Checking if today is 2019-12-22
        LocalDate anotherDate = LocalDate.of(2019, 12, 22);
        boolean areDatesEqual = dateNow.isEqual(anotherDate);
        System.out.println("Dates are equal: " + areDatesEqual);

    }
}
