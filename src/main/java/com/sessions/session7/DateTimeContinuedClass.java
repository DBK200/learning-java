package com.sessions.session7;

import java.time.*;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DateTimeContinuedClass {

    public static void main(String[] args) {

        Period period = Period.of(1,1,1);
        LocalDate localDate = LocalDate.of(1990,10,3);

        System.out.println("Initial date: "+ localDate);
        System.out.println("Shifted date: "+ localDate.plus(period));

        LocalTime presentLocalTime = LocalTime.now();
        System.out.println("[presentLocalTime]: " + presentLocalTime);

        // Holds a period of time
        Duration duration = Duration.ofHours(2);
        // Shifts [presentLocalTime] by [duration]
        LocalTime localTimePlusPeriod = presentLocalTime.plus(duration);
        // Printout
        System.out.println("[localTimePlusPeriod]: " + localTimePlusPeriod);

        // Another method to hold a period of time
        // by difference between 2 LocalTime variables
        Duration durationBetween = Duration.between(presentLocalTime, localTimePlusPeriod);
        System.out.println("[durationBetween]: " + durationBetween);

        // Parsing string as LocalTime
        String timeAsString = "10:20:10";
        LocalTime parsedLocalTime = LocalTime.parse(timeAsString);
        System.out.println("[parsedLocalTime]: " + parsedLocalTime);

        // Checks time equality
        System.out.println(parsedLocalTime.equals(LocalTime.now()));

        // Compares 2 times and gives information
        // about position (i.e., before, after)
        System.out.println(parsedLocalTime.compareTo(LocalTime.now()));

        // LocalDateTime class
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        LocalDate localDate1 = LocalDate.of(1990,12,10);
        LocalTime localTime = LocalTime.of(0,10,10);
        // LocalDateTime by means of LocalDate and LocalTime
        LocalDateTime localDateTime1 = LocalDateTime.of(localDate1, localTime);
        System.out.println(localDateTime1);

        // LocalDateTime
        LocalDateTime localDateTime2 = LocalDateTime.of(2001,2,28,23,34,29);
        LocalDate localDate2 = LocalDate.of(2001,2,28);
        localDate2 = (localDate2.isLeapYear()) ? LocalDate.of(2001,2,29) :
                LocalDate.of(2001,2,28);
        System.out.println(localDate2);

        // ZoneDateTime - considers the time zone
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("[zonedDateTime]: " + zonedDateTime);

        // Different zone than current
        ZoneId zoneIdOfTokyo = ZoneId.of("Asia/Tokyo");
        ZonedDateTime zonedDateTime1 = ZonedDateTime.now(zoneIdOfTokyo);

        System.out.println("[zonedDateTime1]: " + zonedDateTime1);

        // Date (java.util)
        Date date = new Date();
        date.setTime(44444444);
        System.out.println("[date]: " + date);

        // Date (java.sql)
        java.sql.Date dateFromSql = new java.sql.Date(12345);
        System.out.println("[dateFromSql]: " + dateFromSql);

        // Random - generates pseudorandom data
        Random random = new Random();
        // Formats random output: a number between origin and bound
        System.out.println("Current random number is " + random.nextInt(6,9));


        random.setSeed(1223);
        System.out.println(random.nextInt(0,200));
        System.out.println(random.nextDouble(0,125.33));
        System.out.println(random.nextBoolean());


        // Scanner class
        Scanner sc = new Scanner(System.in);
        int userNumber = sc.nextInt();
        int pcNumber = random.nextInt();
        System.out.println("Please enter next an integer: "
                + "\nYou have inserted this number: " + userNumber
                + "\nPC has generated this number: " + pcNumber);
        sc.close();

        Scanner sc = new Scanner(System.in);
        int i = 0;
        System.out.println("Please some numbers to be added [q/Q to quit]:");
        while (sc.hasNext()) {
            i += sc.nextInt();
            if (sc.next().equalsIgnoreCase("q")) break;
        }
        System.out.println("Sum is " + i);

    }
}
