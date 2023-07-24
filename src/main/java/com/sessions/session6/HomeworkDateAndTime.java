package com.sessions.session6;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class HomeworkDateAndTime {
    public static void main(String[] args) {

        //1. Display today's date
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is: " + today);
        System.out.println();

        //2. Display year, month, day information
        LocalDate info = LocalDate.of(1996, 05, 30);
        System.out.println("Year, month and day information");
        System.out.println(info.format(DateTimeFormatter.ofPattern("MM-YYYY-dd")));
        System.out.println();

        // 3. Create a specific date
        LocalDate date = LocalDate.of(2018, 05, 01);
        System.out.println("Date " +  date  + " is created" );
        System.out.println();

        //4. Judging whether two dates read from console are equal
        LocalDate date1 = LocalDate.of(2022, 01, 01);
        LocalDate date2 = LocalDate.of(2022, 03, 03);
        boolean date1IsBeforeDate2 = date1.isBefore(date2);
        System.out.println("date1 " + date1 + " is before date2 " + date2 + ": " + date1IsBeforeDate2);
        System.out.println();

        //5. Checking if today is 2019-12-10

        LocalDate dateToCheck = LocalDate.of(2019, 12, 10);
        boolean condition1 = today.isBefore(dateToCheck);
        boolean condition2 = today.isBefore(dateToCheck);
        if(!(condition1 && condition2)){
            System.out.println("Today " + today + " is not " + dateToCheck);
        }


        //6. Getting the current time
        LocalDateTime currentTime = LocalDateTime.now();
        DateTimeFormatter formattedTime = DateTimeFormatter.ofPattern("dd--MM-yyyy HH:mm:ss");
        String formattedTimeAsString = formattedTime.format(currentTime);
        //System.out.println("Current time is: " + currentTime);
        System.out.println("Current time is: " + formattedTimeAsString);


    }
}
