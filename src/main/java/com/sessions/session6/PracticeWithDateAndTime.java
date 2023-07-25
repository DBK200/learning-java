package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedMap;

public class PracticeWithDateAndTime {





    public static void main(String[] args) {
//        LocalDate myLocalDate1 = LocalDate.now();
////        System.out.println(myLocalDate);
////        System.out.println( myLocalDate.plusDays(2));
////        myLocalDate.plus(2, ChronoUnit.YEARS);
//
//        LocalDate myLocalDate2 = LocalDate.of(1993,12,10);
//        System.out.println(myLocalDate2);
//
////        LocalDate myLocalDate3 = LocalDate.of(1993,30,10);
////        System.out.println(myLocalDate3);
//
//        boolean date1isBeforeDate2 = myLocalDate1.isBefore(myLocalDate2);
//        System.out.println(date1isBeforeDate2);
//
//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//                LocalDate localDateWithZone = LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);
//
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MMMM")));
//
//        //parse
//
//        String myDateAsString = "1990-10-11" ;
//        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//
//
//        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy.dd.MM")));
//        System.out.println(myLocalDateFromString.getDayOfWeek());
//        System.out.println(myLocalDateFromString.getDayOfYear());
//        System.out.println(myLocalDateFromString.getDayOfMonth());
//
//        myLocalDateFromString.isLeapYear();


        // Period


//        Period discountPeriod = Period.of(1,1,1);
//
//        LocalDate localDate = LocalDate.of(1990, 10,3);
//        System.out.println(localDate);
//
//        System.out.println(localDate.plus(discountPeriod));
//


        // LocalTime



//        LocalTime presentLocalTime= LocalTime.now();
//        System.out.println(presentLocalTime);
//
//        Duration duration = Duration.ofHours(2);
//        LocalTime localTimePLusPeriod= presentLocalTime.plus(duration);
//        System.out.println(localTimePLusPeriod);
//
//        Duration durationBetween = Duration.between(presentLocalTime, presentLocalTime.plus(duration));
//        System.out.println(durationBetween);

//        String timeAsString ="10:20";
//
//        LocalTime parsedLocaltime = LocalTime.parse(timeAsString);
//


        //LocalDateTime

//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
//        LocalDate localDate = LocalDate.of(1990,12,10);
//        LocalTime localTime = LocalTime.of(0,2,3,98);
//
//        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
//        System.out.println( localDateTime1);
//
//        LocalDateTime localDateTime = LocalDateTime.of(2001,12,22,23,34,29);
//        System.out.println(localDateTime);
//
//        LocalDate localDate = LocalDate.now();
//
//        localDate.isLeapYear();


        //ZonedDateTime - considers the time zone


//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);
//
//        ZoneId zoneIdOfAustralia = ZoneId.of("Asia/Tokyo");
//        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneIdOfAustralia);
//        System.out.println(asiaZoneDateTime);


        // Random - generates pseudorandom data

//        Random random = new Random();
//
//        System.out.println(random.nextInt(6,9);
//        System.out.println(random.nextBoolean());

        // Scanner
//        Scanner scanner = new Scanner(System.in);
////        String myString = scanner.nextLine();
////        System.out.println("you inserted these words: " + myString);
//
//        int userNumber = scanner.nextInt();
//        Random random = new Random();
//        int pcNumber = random.nextInt(10);
//        System.out.println("You have inserted this number: " +userNumber);
//        System.out.println("PC has generated this number " + pcNumber);
//
//
//
//        Scanner scanner = new Scanner(System.in);
//
//
//         int sum=0;
//
//       while( scanner.hasNextInt()){
//          sum= sum + scanner.nextInt();
//
//        }
//
//        System.out.println("Sum is" +sum);
//
}}
