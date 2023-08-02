package com.sessions.session6;

//import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DateAndTimePractice {
    public static void main(String[] args) {
       /* LocalDate myLocalDate1 = LocalDate.now();
        System.out.println(myLocalDate1);

       // System.out.println(myLocateDate.plusDays(2));
        // myLocalDate.plus(2, ChronoUnit.YEARS);



       *//* LocalDate myLocalDate2 = LocalDate.of(1993, 12, 10);
        System.out.println(myLocalDate2);*//*

        //LocalDate myLocalDate3 = LocalDate.of(1993, 30, 10);
        //System.out.println(myLocalDate3);

       // boolean date1isBeforeDate2 = myLocalDate1.isBefore(myLocalDate2);
       // System.out.println(date1isBeforeDate2);

        // ZoneId -
        ZoneId zoneId = ZoneId.of("Australia/Darwin");
        LocalDate localDateWithZone = LocalDate.now(zoneId);
        System.out.println(localDateWithZone);

        LocalDate myLocalDate2 = LocalDate.of(1993, 10, 12);
        System.out.println(myLocalDate2);
        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yy-dd-MMMMM")));
        */


        // parse - transforma din String si returneaza un LocalDate
//        String myDateAsString = "1990.10.11";
//        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
//                DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//        //myLocalDateFromString.isLeapYear();
//        //System.out.println(myLocalDateFromString);
//        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy.dd.MMMM")));
//        System.out.println(myLocalDateFromString.getDayOfWeek());
//        System.out.println(myLocalDateFromString.getDayOfYear());
//        System.out.println(myLocalDateFromString.getDayOfMonth());

//        Period period = Period.of(1, 1, 1);
//        LocalDate localDate = LocalDate.of(1990, 10, 3);
//        System.out.println(localDate);
//        // la localdate se adauga perioada period
//        System.out.println(localDate.plus(period));

        // LocalTime
//        LocalTime presentLocalTime = LocalTime.now();
//        System.out.println(presentLocalTime);
//
//        Duration duration = Duration.ofSeconds(2);
//        LocalTime localTimePlusPeriod = presentLocalTime.plus(duration);
//        System.out.println(localTimePlusPeriod);
//
//        Duration durationBetween = Duration.between(presentLocalTime, presentLocalTime.plus(duration));
//        System.out.println(durationBetween); // il converteste direct in String

        // parsing String as LocalTime
//        String timeAsString = "10:20:10";
//        LocalTime parsedLocalTime = LocalTime.parse(timeAsString);
//
//        System.out.println(parsedLocalTime);
//
//        System.out.println(parsedLocalTime.compareTo(LocalTime.now()));
//        System.out.println(parsedLocalTime.compareTo(parsedLocalTime));
//        System.out.println(parsedLocalTime.compareTo(parsedLocalTime));
//        System.out.println(parsedLocalTime.equals(LocalTime.now()));
//        parsedLocalTime.isBefore();

        // LocalDateTime
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate localDate = LocalDate.of(1990, 12, 10);
//        LocalTime localTime = LocalTime.of(0, 2, 3);
//
//        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
//        System.out.println(localDateTime1);
//
//        LocalDateTime localDateTime = LocalDateTime.of(2000, 2, 29, 23, 34, 29);
//        System.out.println(localDateTime);

//        LocalDate localDate = LocalDate.of(2004, 12, 2);
//        System.out.println(localDate.isLeapYear());

    // ZonedDateTime = considers time zone
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);
//
//        ZoneId zoneIdOfAustralia = ZoneId.of("Asia/Tokyo");
//        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneIdOfAustralia);
//        System.out.println(asiaZoneDateTime);

        // Date (java.util)
//        Date date = new Date();
//        date.setTime(446753478);
//        System.out.println(date);
//
//        // Date (java.sql)
//        java.sql.Date dateFromSql = new java.sql.Date(12323);
//        System.out.println(dateFromSql);

        // Random - generates pseudorandom data
//        Random random = new Random();
//        System.out.println(random.nextInt(0, 2000));
//        System.out.println(random.nextBoolean());
//        System.out.println(random.nextDouble());

        // Scanner
        Scanner scanner = new Scanner(System.in);

//        String myString =scanner.nextLine();
//        System.out.println("You inserted these words: " + myString);

//        int userNumber = scanner.nextInt();
//        Random random = new Random();
//        int pcNumber = random.nextInt(10);
//        System.out.println("You have inserted this number: " + userNumber);
//        System.out.println("You have inserted this number: " + pcNumber);

//        int sum=0;
//        while(scanner.hasNext()){
//            sum = sum + scanner.nextInt();
//        }
//        System.out.println("Sum is: " + sum );



    }
}
