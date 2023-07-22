package com.sessions.session6;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

public class DateTimePractice
{
    public static void main(String[] args)
    {
//        LocalDate currentDate = LocalDate.now();
//
//        System.out.println("Data de astazi este: " + currentDate);
//
//        System.out.println("Data din viitor este: " + currentDate.plusDays(2));
//
//        System.out.println("Doi ani mai tarziu: " + currentDate.plus(2, ChronoUnit.YEARS));
//
//        LocalDate myLocalDate2 = LocalDate.of(1993, 12, 10);
//
//        System.out.println(myLocalDate2);
//
//        LocalDate myLocalDate3 = LocalDate.of(1992, 7, 8);
//
//        if(myLocalDate3.isBefore(myLocalDate2))
//        {
//            System.out.println("Data este inaintea celei cu care se face comparatia!");
//        }
//
//        if(myLocalDate2.isAfter(myLocalDate3))
//        {
//            System.out.println("Data este dupa cea cu care se face comparatia!");
//        }
//
        // ZoneId

//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        LocalDate localDateZone = LocalDate.now(zoneId);
//
//        System.out.println(localDateZone);

//        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
//
//        LocalDate myCustomLocalDate = LocalDate.of(1998, 10, 12);
//
//        System.out.println("Data cu noul format este: " + myCustomLocalDate.format(pattern));

        //parse

//        String myDateAsString = "1990.10.11";
//
//        LocalDate myDate =  LocalDate.parse(myDateAsString, DateTimeFormatter.ofPattern("yyyy.dd.MM"));
//
//        System.out.println("Data parsata ca string este: " + myDate);

        //Period

//        Period period= Period.of(1,1,1);
//
//        LocalDate localDate4 = LocalDate.of(1990, 10, 3);
//
//        System.out.println("Original date is: " + localDate4 + "\nDate after adding a period is: " + localDate4.plus(period));

//        LocalTime presentLocalTime = LocalTime.now();
//
//        System.out.println(presentLocalTime);
//
//        Duration duration = Duration.ofSeconds(2);
//        LocalTime localTimePlusPeriod = presentLocalTime.plus(duration);
//        Duration durationBetween = Duration.between(presentLocalTime, localTimePlusPeriod);
//
//        System.out.println(presentLocalTime.plus(duration));
//        System.out.println(localTimePlusPeriod);
//        System.out.println(durationBetween);

        //parsing

//        String time = "10:20:10";
//        LocalTime localTimeFormString = LocalTime.parse(time);
//
//        System.out.println(localTimeFormString);
//
//        System.out.println(localTimeFormString.compareTo(LocalTime.now()));
//        System.out.println(LocalTime.now().compareTo(localTimeFormString));
//        System.out.println(localTimeFormString.compareTo(localTimeFormString));

//        LocalDateTime localDateTime = LocalDateTime.now();
//
//        System.out.println(localDateTime);
//
//        LocalDate data = LocalDate.of(1990,12,10);
//        LocalTime time = LocalTime.of(0,2,3, 98);
//
//        LocalDateTime composedLocalDateTime = LocalDateTime.of(data, time);
//
//        System.out.println(composedLocalDateTime);

//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//
//        System.out.println(zonedDateTime);
//
//        ZoneId zoneID = ZoneId.of("Asia/Tokyo");
//
//        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneID);
//
//        System.out.println(asiaZoneDateTime);

        Date date = new Date();

        date.setTime(7807);

        System.out.println(date.toInstant());

        int sum = 0;

        Scanner scanner = new Scanner(System.in);

        while(scanner.hasNextInt())
        {
            sum += scanner.nextInt();
        }

        System.out.println("Sum is: " + sum);
    }
}