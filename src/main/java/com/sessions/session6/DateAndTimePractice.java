package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
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


       //session 7

        //Period
         Period discountPeriod=Period.of(1,1,1);
        System.out.println(discountPeriod);
         LocalDate localDate1=LocalDate.of(1990,10,3);
        System.out.println(localDate1);
        System.out.println(localDate1.plus(discountPeriod));


        //LocalTime
        LocalTime presentLocalTime=LocalTime.now();
        System.out.println(presentLocalTime);

        Duration duration=Duration.ofSeconds(2);
        LocalTime localTimePlusPeriod=presentLocalTime.plus(duration);
        System.out.println(duration);
        System.out.println(localTimePlusPeriod);
        Duration durationBetween=Duration.between(presentLocalTime,localTimePlusPeriod);
        System.out.println(durationBetween);
        System.out.println(durationBetween.getSeconds());

        //Parsing String as local time
        String timeAsString="10:20";
        LocalTime parsedLocalTime=LocalTime.parse(timeAsString);
        System.out.println(timeAsString);


        System.out.println(parsedLocalTime);
        System.out.println(parsedLocalTime.compareTo(LocalTime.now())); //-1
        System.out.println(LocalTime.now().compareTo(parsedLocalTime)); //1
        System.out.println(parsedLocalTime.compareTo(parsedLocalTime)); //0


//    //LocalDateTime
//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate localDate=LocalDate.of(1990,12,10);
//        LocalTime localTime=LocalTime.of(0,2,3,98);

//        LocalDateTime localDateTime1=LocalDateTime.of(localDate,localTime);

//        LocalDateTime localDateTime =LocalDateTime.of(2001,2,22,23,34,29);
//        System.out.println(localDateTime);

//        LocalDate localDate2=LocalDate.of(2004,12,12);
//        System.out.println(localDate2.isLeapYear());

        //ZonedDateTime - considers the time zone
//        ZonedDateTime zonedDateTime=ZonedDateTime.now();
//        System.out.println(zonedDateTime);
//
//        ZoneId zoneIdOfAustralia=ZoneId.of("Asia/Tokyo");
//        ZonedDateTime asiaZone=ZonedDateTime.now(zoneIdOfAustralia);
//        System.out.println(asiaZone);


        //Date(java.util)
//        Date date=new Date();
//        date.setTime(1999999999);
//        System.out.println(date);
//
//        //Date (java.sql)
//        java.sql.Date dateFromSql=new java.sql.Date(1999999999);
//        System.out.println(dateFromSql);

        //Random -generates pseudo random
//        Random random=new Random();
//        System.out.println(random.nextInt(6,25));
////        random.setSeed(5);
//        System.out.println(random.nextBoolean());
//

     //Scanner
        Scanner scanner=new Scanner(System.in);
//        String myString= scanner.nextLine();
//        System.out.println("You inserted this words: "+ myString);
//

//       int userNumber=  scanner.nextInt();
//       Random random=new Random();
//       int pcNumber=random.nextInt(10);
//
//        System.out.println("You have inserted this number: "+ userNumber);
//        System.out.println("PC has generated this number: "+ pcNumber);











    }
}
