package com.sessions.session6;


//import java.time.*;

import java.time.Clock;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Formatter;
import java.util.Random;
import java.util.Scanner;
import java.util.TimeZone;

public class DatesExercises {

    public static void main(String[] args) {

//        DatesExercises datesExercises = new DatesExercises();
//        datesExercises.toString();

//        LocalDate dateNow = LocalDate.now();
//        dateNow.plusDays(2);
//        System.out.println(dateNow); // date without a time-zone, immutable, year-month-day format
//
//        LocalDate myBirthDay1 = LocalDate.of(1993, 12, 10);
//        System.out.println(myBirthDay1);

        //imports!

        //isBefore method

//        //now(), with zone id
//        ZoneId zoneId= ZoneId.of("Australia/Darwin");
//        LocalDate nowWIthZone= LocalDate.now(zoneId);
//        System.out.println(nowWIthZone);

        //changing current default timezone
//
//        LocalDateTime now1=LocalDateTime.now();
//        System.out.println(now1);

//        System.out.println(now);
//        TimeZone.setDefault(TimeZone.getTimeZone("Australia/Darwin")); //set current timezone to ...
        TimeZone.setDefault(TimeZone.getTimeZone("UTC")); //set current timezone to UTC

        LocalDateTime now2=LocalDateTime.now();
        System.out.println(now2);



        //        What Is UTC?
//        UTC—Coordinated Universal Time—is the 24-hour time standard used as a basis for civil time today.
//        All time zones are defined by their offset from UTC.
//        The offset is expressed as either UTC- or UTC+ and the number of hours and minutes.

        //now() with clock - A clock provides access to the current instant, date and time using a time-zone.
//        Clock clock = Clock.systemDefaultZone();
//        Clock clockWithInstantAndZone = Clock.fixed(Instant.ofEpochSecond(1000000), ZoneId.of("Australia/Darwin")); //helpful for testing
//        System.out.println(LocalDate.now(clockWithInstantAndZone));
//
//        System.out.println(clock);
//        System.out.println(clockWithInstantAndZone);
//        System.out.println(LocalDate.now(clock));
//        clock= Clock.system(ZoneId.of("Australia/Darwin"));
//        System.out.println(LocalDate.now(clock));
//        System.out.println(LocalDate.now(clockWithInstantAndZone));


        //leap years
//        LocalDate localDate1 = LocalDate.ofYearDay(2015, 60);
//        LocalDate localDate2 = LocalDate.ofYearDay(2016, 60); // leap year
//        LocalDate localDate3 = LocalDate.ofYearDay(2017, 60);
//        System.out.println(localDate1);
//        System.out.println(localDate2);
//        System.out.println(localDate3);

        //isLeapYear()
//        System.out.println("Is " + localDate1 + " a leap year? " + localDate1.isLeapYear());
//        System.out.println("Is " + localDate2 + " a leap year? " + localDate2.isLeapYear());

        //Local date from epoch days
//        LocalDate and LocalDateTime have a method to convert them into long equivalents in relation
//        to 1970. What’s special about 1970? That’s what UNIX started using for date standards,
//        so Java reused it.
        //■ LocalDate has toEpochDay(), which is the number of days since January 1, 1970.
        //■ LocalDateTime has toEpochTime(), which is the number of seconds since January 1,
        //1970.
        //■ LocalTime does not have an epoch method. Since it represents a time that occurs on
        //any date, it doesn’t make sense to compare it in 1970.


//        LocalDate epochDate = LocalDate.ofEpochDay(0);
//        System.out.println(epochDate);
//        LocalDate epochDate2 = LocalDate.ofEpochDay(20000); // 20000 days after 1970-01-01
//        System.out.println(epochDate2);

        //Period
//        Period period = Period.of(1, 1, 1);
//        LocalDate localDate = LocalDate.of(1990, 01, 01);
//        System.out.println(localDate);
//        System.out.println(localDate.plus(period));
//        //Period.between
//        System.out.println(Period.between(localDate, LocalDate.now()));
//        System.out.println(Period.between(localDate, LocalDate.now()).getYears());

        //Parsing from string to localdate
//        String myDateAsString = "2023-12-01";
//        LocalDate myDate= LocalDate.parse(myDateAsString);
//        System.out.println(myDate);

        //formatters
//        LocalDate myFormattedDate =  LocalDate.of(1999, 10,23);
//        System.out.println(myFormattedDate.format(DateTimeFormatter.ofPattern("YYYY-MM-DD")));
//        System.out.println(myFormattedDate.format(DateTimeFormatter.ofPattern("DD-MMM-YYYY")));

        //exercise - change the format to 2023-17-iulie


//        //LocalTime
//        LocalDate myDate = LocalDate.of(1990, 12, 10);
//        LocalTime myTime = LocalTime.of(12, 10);
//        LocalDateTime localDateTime1 = LocalDateTime.of(myDate, myTime);
//        System.out.println(localDateTime1);

//        //Duration
//        LocalTime localTime = LocalTime.now();
//        Duration duration = Duration.ofHours(1);
//        System.out.println(localTime.plus(duration));
//        System.out.println(Duration.between(localTime, LocalTime.of(2, 0)));
//        System.out.println(Duration.between(localTime, LocalTime.of(2, 0)).getSeconds());
//        System.out.println(Duration.between(LocalTime.of(2, 0), localTime).getSeconds());


        //LocalDateTime
        //now()
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime);
//
        //from

//        LocalDateTime localDateTime = LocalDateTime.of(1990, 1, 1, 12, 0, 0);
//        System.out.println(localDateTime);

//        // DateTimeFormatter
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println("Before formatting " + localDateTime);
//
//        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss"); // d-day M-month y-year H-hour m-minutes s-seconds
//        System.out.println("After formatting " + localDateTime.format(formatter1));
//
//        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("d-MMMM-yyy HH:mm:ss"); // d-day M-month y-year H-hour m-minutes s-seconds
//        System.out.println("After formatting " + localDateTime.format(formatter2));

        //ChronoUnit
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalDateTime localDateTime2 = localDateTime.plus(10, ChronoUnit.YEARS);
//        System.out.println(localDateTime);
//        System.out.println(localDateTime2);

//        LocalDate localDateTime = LocalDate.now();
//        Duration duration = Duration.ofHours(1);
//        localDateTime.plus(duration); - throws exception

        //ZonedDateTime - contains the zone id
//        ZonedDateTime zonedDateTime = ZonedDateTime.now();
//        System.out.println(zonedDateTime);
//
//        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(ZoneId.of("Europe/Bucharest"));
//        System.out.println(zonedDateTime1);
//
//        ZonedDateTime zonedDateTime2 = ZonedDateTime.now(ZoneId.of("Africa/Cairo"));
//        System.out.println(zonedDateTime2);

        //Instant - returns an instantaneous point on the time-line.
//        Instant instant= Instant.now(); //returns current instant
//        System.out.println(instant);

        //transforms from an Instant object to sql Timestamp object, that is suitable for working with sql timestamp data
//        Timestamp timestamp = Timestamp.from(instant);
//        System.out.println(timestamp);

        //java util Date
//        Date date = new Date();
//        date.setTime(1);
//        System.out.println(date);
//
//        //java sql Date
//        java.sql.Date sqlDate = new java.sql.Date(10000);
//        System.out.println(sqlDate);


        //exercise - create a method that tells you if a date has a leap year or not using isLeapYear method from LocalDate
//        System.out.println("Insert a valid date: ");
//        Scanner console = new Scanner(System.in);
//        String input = console.nextLine();
//
//        while (!input.equals("QUIT")){
//            checkLeapYear(input);
//            input = console.nextLine();
//        }

        //Random - used to generate pseudo random data
//        Random random = new Random();
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(6));
//        System.out.println(random.nextInt(6, 9));
//        System.out.println(random.nextInt(6, 9));
//        System.out.println(random.nextInt(6, 9));
//        System.out.println(random.nextInt(6, 9));

        //Scanner
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        System.out.println("Your value was " + input);

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Input first date: ");
//        String date1AsString = scanner.nextLine();
//        LocalDate localDate1 = LocalDate.parse(date1AsString, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
//        System.out.println("Input second date: ");
//        String date2AsString = scanner.nextLine();
//        LocalDate localDate2 = LocalDate.parse(date2AsString, DateTimeFormatter.ofPattern("yyyy-dd-MM"));
//        System.out.println(localDate1.equals(localDate2));

    }
    //exercise1
    private static void checkLeapYear(String localDateAsString) {
        LocalDate myDate = LocalDate.parse(localDateAsString); //parse the date
        if (myDate.isLeapYear()) {
            System.out.println("This is a leap year: " + myDate);
        } else {
            System.out.println("This is not a leap year: " + myDate);
        }
        System.out.println("Insert a valid date: ");
    }


    //RECAP: LocalDate, LocalTime, LocalDateTime, Formatter, ZoneId, Clock
}