package com.sessions.session6;

import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.ZoneId;
import java.time.DateTimeException;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DateAndTime {
    public static void main(String[] args) {
//        LocalDate myLocalDate1 = LocalDate.now();
//        System.out.println(myLocalDate1);
//
//        System.out.println(myLocalDate.plusDays(2)); //immutable, will show nothing
//        myLocalDate.plus(2, ChronoUnit.YEARS);

//        LocalDate myLocalDate2 = LocalDate.of(1993, 12, 10);
//        System.out.println(myLocalDate2);

//        LocalDate myLocalDate3 = LocalDate.of(1993,30,10);
//        System.out.println(myLocalDate3); //throws exception because month is wrong

//        boolean date1isBeforeDate2 = myLocalDate1.isBefore(myLocalDate2);
//        System.out.println(date1isBeforeDate2);

        //ZoneId

//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        LocalDate localDateWithZone = LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);

//        LocalDate myLocalDate2 = LocalDate.of(1993,10,12);
//        System.out.println(myLocalDate2);
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyy-dd-M")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyy-dd-MMMM")));

        //parse
//        String myDateAsString = "1990-10-11";
//        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString);
//        System.out.println(myLocalDateFromString);
//
//        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy-dd-m")));
//        System.out.println(myLocalDateFromString.getDayOfWeek());
//        System.out.println(myLocalDateFromString.getYear());

        //Period
//       Period discountPeriod = Period.of(1,1,1);
//       LocalDate localDate = LocalDate.of(1990,10,3);
//        System.out.println(localDate);
//        System.out.println(localDate.plus(discountPeriod));

        //LocalTime
//        LocalTime presentLocalTime = LocalTime.now();
//        System.out.println(presentLocalTime);
//
//        Duration duration = Duration.ofHours(2);
//        LocalTime localTimeplusPeriod = presentLocalTime.plus(duration);
//        System.out.println(localTimeplusPeriod);
//        Duration durationBetween = Duration.between(presentLocalTime, localTimeplusPeriod);
//        System.out.println(durationBetween);

        //Parsing String as LocalTime
//        String timeAsString = "10:20:10";
//        LocalTime parsedLocalTime = LocalTime.parse("timeAsString");
//        System.out.println(parsedLocalTime);

         //LocalDateTime
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate localDate = LocalDate.of(1990,12,10);
//        LocalTime localTime = LocalTime.of(0,2,3);
//
//        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
//        System.out.println(localDateTime1);

//        LocalDateTime localDateTime = LocalDateTime.of(2000,2,29,23,34);
//        System.out.println(localDateTime);

//        LocalDate localDate = LocalDate.of(2004,12,2);
//        System.out.println(localDate.isLeapYear());

          //ZoneDateTime - consider the time zone
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);
//
//        ZoneId zoneIdOfAustralia = ZoneId.of("Asia/Tokyo");
//        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneIdOfAustralia);
//        System.out.println(asiaZoneDateTime);

        //Date (java.util)
//        Date date = new Date();
//        date.setTime(304906578);
//        System.out.println(date);

        //Date (java.sql)
//        java.sql.Date dateFromSql = new java.sql.Date(12323);
//        System.out.println(dateFromSql);

        //
//        Random random = new Random();
//        System.out.println(random.nextInt(6,2000));
//        System.out.println(random.nextBoolean());
//        System.out.println(random.nextDouble());

        //Scanner
//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.nextLine();
//        System.out.println("you inserted these words: "+myString);

//        int userNumber = scanner.nextInt();
//        Random random = new Random();
//        int pcNumber = random.nextInt(10);
////        System.out.println("You have inserted these number: "+userNumber);
////        System.out.println("PC has generated this number: "+pcNumber);

//        Scanner scanner = new Scanner(System.in);
//        int sum = 0;
//        while (scanner.hasNext()){
//           if(scanner.next().equalsIgnoreCase("x")){
//               break;
//           }
//            sum += scanner.nextInt();
//
//        }
//        System.out.println("Sum is "+sum);

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()){
            sum += scanner.nextInt();

        }
        System.out.println("Sum is "+sum);
    }
}
