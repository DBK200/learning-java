package com.sessions.session6;

import java.time.*;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class PracticeWithDateAndTime {

    public static void main(String[] args) {
//        LocalDate myLocalDate1 = LocalDate.now();
//        System.out.println(myLocalDate1);
//
//        System.out.println(myLocalDate.plusDays(2));
//        myLocalDate.plus(2 ,ChronoUnit.YEARS);
//
//        LocalDate myLocalDate2 = LocalDate.of(1993,12,10);
//        System.out.println(myLocalDate2);

//        LocalDate myLocalDate3 = LocalDate.of(1993, 30, 10);
//        System.out.println(myLocalDate3); //throws exception

//        boolean date1isBeforeDate2 = myLocalDate1.isBefore(myLocalDate2);
//        System.out.println(date1isBeforeDate2);

        // ZoneId
//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        LocalDate localDateWithZone = LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);

//        LocalDate myLocalDate2 = LocalDate.of(1993, 10, 12);
//        System.out.println(myLocalDate2);
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-M")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yy-dd-MMMM")));

        //parse
        String myDateAsString = "1990.10.12";
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
                DateTimeFormatter.ofPattern("yyyy.MM.dd"));

        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy-dd-M")));
        System.out.println(myLocalDateFromString.getDayOfWeek()); //returns day of week - TUESDAY
        System.out.println(myLocalDateFromString.getDayOfYear());
        System.out.println(myLocalDateFromString.getDayOfMonth());

    }
}
