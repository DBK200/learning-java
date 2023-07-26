/**********************
 *                    *
 *  Date: 18.07.2023  *
 *                    *
 **********************/

package com.sessions.session6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateTimeClass {

    public static void main(String[] args) {
        //  Local[Date,Time,DateTime]
        //  ZonedDateTime

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        // [dateNow] remains the same, because LocalDate is immutable
        dateNow.plusDays(21);
        System.out.println("dateNow: " + dateNow);
        // Adds up a specific quantity
        dateNow.plus(2, ChronoUnit.YEARS); // adds 2 YEAR units

        LocalDate dateSpecific1 = LocalDate.of(1993,12,1);
        System.out.println("dateSpecific1: " + dateSpecific1);

        // Throws an exception: Month value is bigger than 12
//        LocalDate dateSpecific2 = LocalDate.of(1993, 13, 10);

        // Dates comparison
        boolean bDate1IsBeforeDate2 = dateSpecific1.isBefore(dateNow);
        System.out.println("dateSpecific1 is before dateNow is " + bDate1IsBeforeDate2);

        // ZoneId
        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        LocalTime timeNow = LocalTime.now(zoneId);
        System.out.println("Local time in 'Australia/Darwin' is: " + timeNow);

        // Date output formatting
        System.out.println("New format for dateSpecific1 is " + dateSpecific1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("New format for dateSpecific1 is " + dateSpecific1.format(DateTimeFormatter.ofPattern("d.MMMM.yyyy")));

        // Using '.' instead of '-' as date separator
        String myDateAsString = "1974.09.17";
        // We have to use a formatter to accept the change,
        // but [myLocalDateFromString] will still use '-' as separator]
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
                DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        // If we want to change that, we will have to use a formatter
        System.out.println("LocalDate from String is " + myLocalDateFromString.format(DateTimeFormatter.ofPattern("dd.MM.yyy")));
        System.out.println("LocalDate from String is LeapYear is " + myLocalDateFromString.isLeapYear());

        // Gets the day of week name
        System.out.println("LocalDate from String was " + myLocalDateFromString.getDayOfWeek());
    }

}
