package com.sessions.session6;

//import java.time.LocalDate;
import java.time.*; // toate clasele
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class DatesPractice {

    public static void main(String[] args) {

        //LocalDate myLocalDate = new LocalDate(); nu putem pt ca e constructor privat

//        LocalDate myLocalDate1 = LocalDate.now();

        //java.time.LocalDate -> se poate si asa, dar e un hack

//        System.out.println(myLocalDate);

//        myLocalDate.plusDays(2);
//        System.out.println(myLocalDate.plusDays(2));
//        myLocalDate.plus(2, ChronoUnit.YEARS);

//        LocalDate myLocalDate2 = LocalDate.of(1993, 12, 10);
//        System.out.println(myLocalDate2);

//        LocalDate myLocalDate3 = LocalDate.of(1993, 30, 10);
//        System.out.println(myLocalDate3); //exception

//        boolean isBefore = myLocalDate1.isBefore(myLocalDate2);
//        System.out.println(isBefore);

        //ZoneId
//        ZoneId zoneId = ZoneId.of("Australia/Darwin");
//        LocalDate localDateWithZone = LocalDate.now(zoneId);
//        System.out.println(localDateWithZone);

//        LocalDate myLocalDate2 = LocalDate.of(1993, 10, 22);
//        System.out.println(myLocalDate2);
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"))); // m mic e pentru minute
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy-dd-MM")));
//        System.out.println(myLocalDate2.format(DateTimeFormatter.ofPattern("yyyy.dd.MMM")));

        //parse
//        String myDateAsString = "1990.10.12";
//        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString,
//                DateTimeFormatter.ofPattern("yyyy.MM.dd"));
//        boolean isLeapYear = myLocalDateFromString.isLeapYear(); //daca ean bisect
//        System.out.println(myLocalDateFromString.format(DateTimeFormatter.ofPattern("yy.dd.MMMM")));
//        System.out.println(isLeapYear);
//
//        System.out.println(myLocalDateFromString.getDayOfWeek());
//        System.out.println(myLocalDateFromString.getDayOfYear());
//        System.out.println(myLocalDateFromString.getDayOfMonth());

        //period
//        Period period = Period.of(1,1,1);
//        LocalDate localDate = LocalDate.of(1990, 10, 3);
//        System.out.println(localDate);
//        System.out.println(localDate.plus(period));

        //LocalTime
//        LocalTime presentLocalTime = LocalTime.now();
//        System.out.println(presentLocalTime);
//
//        Duration duration = Duration.ofHours(2);
//        LocalTime localTimePlusPeriod = presentLocalTime.plus(duration);
//        System.out.println(localTimePlusPeriod);
//        Duration durationBetween = Duration.between(presentLocalTime, localTimePlusPeriod);
//        System.out.println(durationBetween);

        //parsing String as LocalTime
//        String timeAsString = "10:20:10";
//        LocalTime parsedLocalTime = LocalTime.parse(timeAsString);
//        System.out.println(parsedLocalTime.compareTo(LocalTime.now())); // -1 - primul inainte de al doilea
//        System.out.println(LocalTime.now().compareTo(parsedLocalTime)); // 1 - invers
//        System.out.println(parsedLocalTime.compareTo(parsedLocalTime)); // 0 - egale
//        System.out.println(parsedLocalTime.equals(parsedLocalTime));

        //LocalDateTime
//        LocalDateTime localDateTime = LocalDateTime.now();
//        System.out.println(localDateTime); //print il transforma in string
//        LocalDate localDate = LocalDate.of(1990, 12, 10);
//        LocalTime localTime = LocalTime.of(0, 2, 3, 98);
//        LocalDateTime localDateTime1 = LocalDateTime.of(localDate, localTime);
//        System.out.println(localDateTime1);

//        LocalDateTime localDateTime = LocalDateTime.of(2000, 2, 29, 23, 37, 23);
//        System.out.println(localDateTime);

//        LocalDate localDate = LocalDate.of(2004, 12, 2);
//        System.out.println(localDate.isLeapYear()); //true

        //ZoneDateTime - considers the time zone
//        ZonedDateTime zoneDateTime = ZonedDateTime.now();
//        System.out.println(zoneDateTime);
//
//        ZoneId zoneIdOfAustralia = ZoneId.of("Asia/Tokyo");
//        ZonedDateTime asiaZoneDateTime = ZonedDateTime.now(zoneIdOfAustralia);
//        System.out.println(asiaZoneDateTime);

        //Date - java.util
//        Date date = new Date();
//        date.setTime(1678659708);
//        System.out.println(date);

        // Date - java.SQL
//        java.sql.Date dateFromSql = new java.sql.Date(234513);
//        System.out.println(dateFromSql);

        //Random - generates pseudorandom data
//        Random random = new Random();
//        System.out.println(random.nextInt(0,356));
//        System.out.println(random.nextBoolean());

        //Scanner
//        Scanner scanner = new Scanner(System.in);
//        String myString = scanner.nextLine();
//        System.out.println("you inserted these words: " + myString);

//        int userNumber = scanner.nextInt();
        Random random = new Random();
        int pcNumber = random.nextInt(10);
//        System.out.println("You have inserted this number: " + userNumber);
//        System.out.println("PS has generated this number: " + pcNumber);

        Scanner scanner = new Scanner(System.in);

//        int sum = 0;
//        while (scanner.hasNextInt()) {
//            if(scanner.next().equalsIgnoreCase("")) {
//                break;
//            }
//            sum += scanner.nextInt();
//        }
//
//        System.out.println("Sum is " + sum);

        int sum = 0;
        scanner.useDelimiter("-");
        while (scanner.hasNextInt()) {
            sum += scanner.nextInt();
        }

        System.out.println("Sum is " + sum);



    }

}
