package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DataTime {

    public static void main(String[] args){

//         LocalDate myLocalDate = LocalDate.now();
//         System.out.println(myLocalDate);
//
//
//         System.out.println(myLocalDate.plusDays(2));
////         myLocalDate.plus(2, ChronoUnit.DAYS);
//
//        LocalDate myLocalDate2=LocalDate.of(1993,12,10);
//        System.out.println(myLocalDate2);
//
////        LocalDate myLocalDate3=LocalDate.of(1993,30,10);
////        System.out.println(myLocalDate3);
//
//        boolean date1isBefore= myLocalDate.isBefore(myLocalDate2);
//        System.out.println(date1isBefore);
//
//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        LocalDate localDateWithZone= LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);

//        LocalDate myLocalDate2 = LocalDate.of(1993,10,12);
//        System.out.println(myLocalDate2);
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MMMM")));

        //parse
//        String  myDateAsString="1990-10-11";
//        LocalDate myLocalDateFromString=LocalDate.parse(myDateAsString,
//                DateTimeFormatter.ofPattern("yyyy.MM.DD"));
//        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));


        //Period
//        Period period =Period.of(1,1,1);
//        LocalDate localDate=LocalDate.of(1990,10,3);
//        localDate.plus(period);
//        System.out.println(localDate);
//        System.out.println(localDate.plus(period));

        //LocalTime

//        LocalTime pressentLocalTime=LocalTime.now();
//        System.out.println(pressentLocalTime);
//
//        Duration duration=Duration.ofHours(2);
//        LocalTime localTimePlusPeriod=pressentLocalTime.plus(duration);
//        System.out.println(localTimePlusPeriod);
//        Duration durationBetween=Duration.between(pressentLocalTime, pressentLocalTime.plus(duration));
//        System.out.println(durationBetween);


        //pharsing string as LocalTime

        String timeAsString="10:20:10";
        LocalTime parsedLocalTime=LocalTime.parse(timeAsString);
        parsedLocalTime.compareTo(LocalTime.now());
        System.out.println(parsedLocalTime);

        //LocalDateTime
//        LocalDateTime localDateTime=LocalDateTime.now();
//        System.out.println(localDateTime);
//        LocalDate localDate= LocalDate.of(1990,12,10);
//        LocalTime localTime=LocalTime.of(0,2,3);
//        LocalDateTime localDateTime1=localDateTime.of(localDate,localTime);
//        System.out.println(localDateTime1);


//        LocalDateTime localDateTime=LocalDateTime.of(1993,10,23,23,23,23);
//        System.out.println(localDateTime);

//        LocalDate localDate=LocalDate.now();
//        localDate.isLeapYear();
//        System.out.println(localDate.isLeapYear());

        //ZonedDateTime - considers the time zone
//        ZonedDateTime zonedDateTime=ZonedDateTime.now();
//        System.out.println(zonedDateTime);

        //Date (java.util)

//        Date date =new Date();
//        date.setTime(1444353466);
//        System.out.println(date);

        //Date(java.sql)
//        java.sql.Date dateFromSql=new java.sql.Date(12323);
//        System.out.println(dateFromSql);


        //Random
//        Random random=new Random();
//        System.out.print(random.nextInt(1,6)+" ");
//        System.out.print(random.nextInt(1,6));


        //Scanner
//       Scanner scanner=new Scanner(System.in);
//        String myString = scanner.nextLine();
//        System.out.println("you inserted this words: "+ myString);

//        int userNumber= scanner.nextInt();
//        Random random=new Random();
//        int pcNumber=random.nextInt(10);

//        Scanner scanner=new Scanner(System.in);
//
//        int sum=0;
//        while (scanner.hasNextInt()){
//            sum+=scanner.nextInt();
//            System.out.print(sum+"+");
        }
    }


