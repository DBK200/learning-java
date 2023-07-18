package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DateAndTime {
    public static void main(String[] args) {


//        LocalDate myLocalDate1 = LocalDate.now();
//        System.out.println(myLocalDate1);
//
//        System.out.println(myLocalDate.plusDays(4));
//        System.out.println(myLocalDate.plus(2, ChronoUnit.CENTURIES));

//        LocalDate myLocalDate2 = LocalDate.of(1999,12,15);
//        System.out.println(myLocalDate2);

//        LocalDate myLocalDate3 = LocalDate.of(1920, 30, 10);
//        System.out.println(myLocalDate3); // throws exception

//        boolean dateComparison = myLocalDate1.isAfter(myLocalDate2);
//        System.out.println(dateComparison);
//
//        ZoneId zoneId = ZoneId.of("Pacific/Auckland");
//        LocalDate localDateWithZone = LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);


//        LocalDate localDate = LocalDate.of(2000, 10,20);
//        System.out.println(localDate);
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMMM.dd.yyyy")));
//        System.out.println(localDate.format(DateTimeFormatter.ofPattern("MMMM-dd-yyyy")));
//        System.out.println(localDate.getDayOfMonth());

        String myDateAsString = "1992-11-28";
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString);
        System.out.println(myLocalDateFromString.isLeapYear());
        System.out.println(myLocalDateFromString);



    }
}
