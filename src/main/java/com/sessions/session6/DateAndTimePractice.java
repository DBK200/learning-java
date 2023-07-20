package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;


public class DateAndTimePractice {

    public static void main(String[] args){



        //LocalData - immutable

        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);

        localDate.plusDays(2);
        System.out.println(localDate);

        localDate.plus(2, ChronoUnit.YEARS);

        LocalDate myLocalDate= LocalDate.of(1997,9,19);
        System.out.println(myLocalDate);

        //Throws error
//        LocalDate myLocalDate3=LocalDate.of(1993,30,10);
//        System.out.println(myLocalDate3);

        boolean isBefore=myLocalDate.isBefore(localDate);
        System.out.println(isBefore);

        ZoneId zoneId= ZoneId.of("Australia/Darwin");
        LocalDate localDateWithZone=LocalDate.now(zoneId);
        System.out.println(localDateWithZone);

        LocalDate myLocalDate2=LocalDate.of(1993,10,12);
        System.out.println(myLocalDate2);
        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("dd-MMM-yyyy")));
        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));


        //parse
        String myDateAsString="1990.10.12";
//        LocalDate myLocalDateFromString=LocalDate.parse(myDateAsString);
        LocalDate myLocalDateFromString=LocalDate.parse(myDateAsString,DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(myLocalDateFromString);

        System.out.println(myLocalDateFromString.getDayOfWeek());
        System.out.println(myLocalDateFromString.getDayOfMonth());
        System.out.println(myLocalDateFromString.getDayOfYear());









    }
}
