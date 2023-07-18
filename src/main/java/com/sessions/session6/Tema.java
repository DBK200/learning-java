package com.sessions.session6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Tema {
    public static void main(String[] args){
        //1 Display today's date
        LocalDate TodayDate = LocalDate.now();
        System.out.println("1."+TodayDate);

        //2 Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day):
        LocalDate HomeworkDate1 = LocalDate.of(2005,12,20);
        System.out.println("2."+HomeworkDate1.format(DateTimeFormatter.ofPattern("MM-YYYY-dd")));

        //3 Checking if today is 2019-12-22
        LocalDate HomeworkDate2 = LocalDate.of(2019,12,22);
        boolean date1isBeforeHomeworkDate2 = TodayDate.isBefore(HomeworkDate2);
        System.out.println("3."+date1isBeforeHomeworkDate2);

        //4 Judging whether two dates read from console are equal
        ZoneId zoneId = ZoneId.of("Europe/Paris");
        LocalDate localDateWithZone = LocalDate.now(zoneId);
        boolean date2isBeforeHomeworkDate2 = TodayDate.isBefore(localDateWithZone);
        System.out.println("4."+date2isBeforeHomeworkDate2);

        //5 Write a method that prints local time with the following format HH:mm:ss
        LocalTime currentTime = LocalTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = currentTime.format(formatter);
        System.out.println("5." + formattedTime);

        //6 Write a method that calculates your age based on your birthday. The date of birth must be read from the console
        Scanner scanner = new Scanner(System.in);
        System.out.print("6.Enter your date of birth (YYYY-MM-DD): ");
        String dateOfBirthString = scanner.nextLine();
        scanner.close();
        LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString);
        int age = calculateAge(dateOfBirth);
        System.out.println("6.Your age is: " + age);
    }

    public static int calculateAge(LocalDate dateOfBirth) {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(dateOfBirth, currentDate);
        int age = period.getYears();
        return age;


    }
}
