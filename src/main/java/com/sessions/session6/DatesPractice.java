package com.sessions.session6;

//import java.time.LocalDate;
import java.time.*; // toate clasele
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class DatesPractice {

    public static void main(String[] args) {

        //LocalDate myLocalDate = new LocalDate(); nu putem pt ca e constructor privat

//        LocalDate myLocalDate1 = LocalDate.now();

        //java.time.LocalDate -> se poate si asa, dar e un hack

//        System.out.println(myLocalDate);

//        myLocalDate.plusDays(2);
//        System.out.println(myLocalDate.plusDays(2));
//        myLocalDate.plus(2, ChronoUnit.YEARS);

//        LocalDate myLocalDate2 = LocalDate.of(1993, 12, 10);
//        System.out.println(myLocalDate2);

//        LocalDate myLocalDate3 = LocalDate.of(1993, 30, 10);
//        System.out.println(myLocalDate3); //exception

//        boolean isBefore = myLocalDate1.isBefore(myLocalDate2);
//        System.out.println(isBefore);

        //ZoneId
//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        LocalDate localDateWithZone = LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);

//        LocalDate myLocalDate2 = LocalDate.of(1993, 10, 22);
//        System.out.println(myLocalDate2);
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); // m mic e pentru minute
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy.dd.MMM")));

        //parse
        String myDateAsString = "1990.10.12";
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
                DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        boolean isLeapYear = myLocalDateFromString.isLeapYear(); //daca ean bisect
        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy.dd.MMMM")));
        System.out.println(isLeapYear);

        System.out.println(myLocalDateFromString.getDayOfWeek());
        System.out.println(myLocalDateFromString.getDayOfYear());
        System.out.println(myLocalDateFromString.getDayOfMonth());

    }

}
