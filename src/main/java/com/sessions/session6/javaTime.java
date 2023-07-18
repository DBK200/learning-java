package com.sessions.session6;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class javaTime {
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

        String myDateAsString = "1990.10.11";

        LocalDate myDate =  LocalDate.parse(myDateAsString, DateTimeFormatter.ofPattern("yyyy.dd.MM"));

        System.out.println("Data parsata ca string este: " + myDate);
    }
}
