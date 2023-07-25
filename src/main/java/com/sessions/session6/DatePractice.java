package com.sessions.session6;

//import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DatePractice {

    public static void main(String[] args){

        LocalDate myLocalDate = LocalDate.now();
        System.out.println("Local Date: " + myLocalDate);
        //Afiseaza date current

        System.out.println("Local Date + 3 days: " + myLocalDate.plusDays(3));

        System.out.println("Local Date First day of Next Month: "
                + myLocalDate.plusDays(myLocalDate.lengthOfMonth() - myLocalDate.getDayOfMonth() + 1));

        System.out.println("Last day of Month: " + myLocalDate.lengthOfMonth());

        System.out.println("Local Date + 2 Years: " + myLocalDate.plus(2 , ChronoUnit.YEARS));

        LocalDate myLocalDate2 = LocalDate.of(1993,12,10);
        System.out.println(("Local Date2: ") + myLocalDate2);

        /*
        LocalDate myLocalDate3 = LocalDate.of(1993,30,10);
        System.out.println(("Local Date3: ") + myLocalDate2);

        throws exception
        */

        //System.out.println(myLocalDate2.isBefore(myLocalDate));
        String isBefore = myLocalDate2.isBefore(myLocalDate) ? "Local Date2 is before Local Date" : "Local Date2 isn't before Local Date";
        System.out.println(isBefore);

        //Zone ID
        ZoneId zoneid = ZoneId.of("Australia/Darwin");
        LocalDate localDateWithZone = LocalDate.now(zoneid);
        System.out.println("Local Date without Zone: " + LocalDate.now());
        System.out.println("Local Date with Zone: " + localDateWithZone);

        System.out.println("Local Date2: " + myLocalDate2);
        System.out.println("Local Date2 format redundant: " + myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd")));
        System.out.println("Local Date2 format year/day/month: " + myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
        System.out.println("Local Date2 format year/day/month: " + myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MMMM")));

        //String to Date
        String myDateAsString = "1990-10-11";
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString);
        System.out.println("Local Date from String to Date: " + myLocalDateFromString);

        String myDateAsString2 = "01.06.2001";
        LocalDate myLocalDateFromString2 = LocalDate.parse(myDateAsString2 ,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Local Date from String to Date with '.': " + myLocalDateFromString2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));

        //Period
        Period period = Period.of(1,1,1);
        LocalDate localDate = LocalDate.of(1990,10,3);
        System.out.println("Data originala:" + localDate + " data dupa perioada:" + localDate.plus(period));

        //Local Time
        LocalTime presentLocalTime = LocalTime.now();
        System.out.println("Ora este: " + presentLocalTime);

        //Duration
        Duration duration = Duration.ofSeconds(2);
        System.out.println("Local time + duration " + presentLocalTime.plus(duration));

        Duration durationBetween = Duration.between(presentLocalTime , presentLocalTime.plusSeconds(2));

        LocalTime x = LocalTime.now();
        for (int i = 0 ; i < 99999 ; i++ )
            for (int j = 0 ; j < 99999 ; j++ );
        LocalTime y = LocalTime.now();
        System.out.println("Time from " + x + " to " + y + " is: " + Duration.between(x,y));

        //parsing String as LocalTime
        String timeAsString = "10:20:10";
        LocalTime paredLocalTime = LocalTime.parse(timeAsString);
        System.out.println("Parsed time: " + paredLocalTime);
        //compareTo , equals
        System.out.println(paredLocalTime.compareTo(paredLocalTime));
        System.out.println(paredLocalTime.equals(paredLocalTime));

        //LocalDateTime
        System.out.println("Local Date Time: " + LocalDateTime.now());
        LocalDate newLocalDate = LocalDate.of(1990,12,10);
        LocalTime newlocalTIme = LocalTime.of( 0,2,3);

        LocalDateTime localDateTime = LocalDateTime.of(newLocalDate, newlocalTIme);
        System.out.println("Local Date Time from a localdate and localtime " + localDateTime);

        LocalDate leapLocalDate = LocalDate.now();
        System.out.println("Is this year a leap year ? " + localDate.isLeapYear());

        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zone Date Time: " + zonedDateTime);

        ZoneId zoneIdOfAustralia = ZoneId.of("Asia/Tokyo");
        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneIdOfAustralia);
        System.out.println("Zone Date Time from a zoneId: " + asiaZoneDateTime);

        //Date (java.util)
        Date date = new Date();
        date.setTime(999999999);
        System.out.println(date);

        //Date (java.sql)
        java.sql.Date dateFromSql = new java.sql.Date(12323);
        System.out.println(dateFromSql);

        //Random
        Random random = new Random();
        System.out.println(random.nextInt());
        System.out.println(random.nextInt(6));
        System.out.println(random.nextInt(6,32));
        System.out.println();

        //Scanner
        Scanner scanner = new Scanner(System.in);
        //String myString = scanner.nextLine();
        //System.out.println("you inserted these words: " + myString);

        //int userNumber = scanner.nextInt();
        //int pcNumber = random.nextInt();
        //System.out.println("You have inserted dis number " + userNumber);
        //System.out.println("PC has generated dis number " + pcNumber);

        int sum = 0;
        while (scanner.next().isBlank()) {
            sum+= scanner.nextInt();
        }

    }
}
