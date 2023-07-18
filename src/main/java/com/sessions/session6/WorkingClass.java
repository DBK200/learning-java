package com.sessions.session6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class WorkingClass {

    public static void main(String[] args) {
        //  Local[Date,Time,DateTime]
        //  ZonedDateTime

        LocalDate dateNow = LocalDate.now();
        System.out.println(dateNow);
        dateNow.plusDays(21); // returns the same [dateNow]. LocalDate is immutable
        System.out.println("dateNow: " + dateNow);
        // adds up a specific quantity
        dateNow.plus(2, ChronoUnit.YEARS); // adds 2 units of YEAR

        LocalDate dateSpecific1 = LocalDate.of(1993,12,1);
        System.out.println("dateSpecific1: " + dateSpecific1);

        // throws an exception: month value is bigger than 12
//        LocalDate dateSpecific2 = LocalDate.of(1993, 13, 10);

        boolean bDate1IsBeforeDate2 = dateSpecific1.isBefore(dateNow);
        System.out.println("dateSpecific1 is before dateNow is " + bDate1IsBeforeDate2);

        // ZoneId -
        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        LocalTime timeNow = LocalTime.now(zoneId);
        System.out.println("Local time in 'Australia/Darwin' is: " + timeNow);

        // date output formatting
        System.out.println("New format for dateSpecific1 is " + dateSpecific1.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println("New format for dateSpecific1 is " + dateSpecific1.format(DateTimeFormatter.ofPattern("d.MMMM.yyyy")));

        // using '.' instead of '-' as date separator
        String myDateAsString = "1974.09.17";
        // have to use a formatter to accept the change,
        // but [myLocalDateFromString] will '-' as separator]
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
                DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        // if we want to change that, will have to use a formatter
        System.out.println("LocalDate from String is " + myLocalDateFromString.format(DateTimeFormatter.ofPattern("dd.MM.yyy")));
        System.out.println("LocalDate from String is LeapYear is " + myLocalDateFromString.isLeapYear());

        // gets the day of week name of
        System.out.println("LocalDate from String was " + myLocalDateFromString.getDayOfWeek());
    }

}
