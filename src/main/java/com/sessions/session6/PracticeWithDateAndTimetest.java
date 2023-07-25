package com.sessions.session6;

import java.text.DateFormat;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class PracticeWithDateAndTimetest {
    public static void main(String[] args){
        // LocalDate myLocalDate1 = LocalDate.now();
        // System.out.println(myLocalDate1);

      //  System.out.println(myLocalDate1.plusDays(2));
       // myLocalDate1.plus(2 , ChronoUnit.YEARS);

      // LocalDate myLocalDate2 = LocalDate.of(1993,12,10);
       // System.out.println(myLocalDate2);

      //  LocalDate myLocalDate3 = LocalDate.of(1993,11,10);
       // System.out.println(myLocalDate3);

      //  boolean isBefore= myLocalDate1.isBefore(myLocalDate2);
      //  System.out.println(isBefore);

       // ZoneId zoneId = ZoneId.of("Australia/Darwin");
       // LocalDate localDateWithZone = LocalDate.now(zoneId);
       // System.out.println(localDateWithZone);

       // LocalDate myLocalDate2 = LocalDate.of(1993,10,12);
     //   System.out.println(myLocalDate2);
       // System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
       // System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-M")));
       // System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yy-dd-MMMM")));

       /* String myDateAsString = "1990.10.12";
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
                DateTimeFormatter.ofPattern("yyyy.MM.dd"));
        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy.dd.MM")));
        System.out.println(myLocalDateFromString.getDayOfWeek());
        System.out.println(myLocalDateFromString.getDayOfYear());
        System.out.println(myLocalDateFromString.getDayOfMonth());
        */

       /* Period period = Period.of(1,1,1);
        LocalDate localDate = LocalDate.of(1990,10,3);
        localDate.plus(period);
        System.out.println(localDate);
        System.out.println(localDate.plus(period));
*/
//        LocalTime presentLocalTime = LocalTime.now();
//        System.out.println(presentLocalTime);

//        Duration duration = Duration.ofHours(2);
//        LocalTime localTimePlusPeriod = presentLocalTime.plus(duration);
//        System.out.println(localTimePlusPeriod);
//        Duration durationBetwee = Duration.between(presentLocalTime,presentLocalTime.plus(duration));
//        System.out.println(durationBetwee);

       /* String timeAsString = "10:20";
        LocalTime parsedLocalTime = LocalTime.parse(timeAsString);
        System.out.println(parsedLocalTime);
        System.out.println(parsedLocalTime.compareTo(LocalTime.now()));
        System.out.println(LocalTime.now().compareTo(parsedLocalTime));
        System.out.println(parsedLocalTime.compareTo(parsedLocalTime));
        System.out.println(parsedLocalTime.equals(parsedLocalTime)); */

        /*LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);
        LocalDate localDate = LocalDate.of(1990,12,10);
        LocalTime localTime = LocalTime.of(0,2,3);
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
        System.out.println(localDateTime1);*/

       /* LocalDateTime localDateTime = LocalDateTime.of(2004,12,2,23,34,29);
        System.out.println(localDateTime);

        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.isLeapYear());*/

        /*ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println(zonedDateTime);

        ZoneId zoneIOfAustralia = ZoneId.of("Asia/Tokyo");
        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneIOfAustralia);
        System.out.println(asiaZoneDateTime);

         */

       /* Date date = new Date();
        date.setTime(134534578);
        System.out.println(date);

        java.sql.Date dateFromSql = new java.sql.Date(12323);
        System.out.println(dateFromSql);

        */

        /*Random random = new Random();
        System.out.println(random.nextInt(6,9));
        System.out.println(random.nextBoolean());
         */

        Scanner scanner = new Scanner(System.in);



    }
}
