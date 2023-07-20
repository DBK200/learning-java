package com.sessions.session6;
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
public class tema
{
    public static void main(String[] args)
    {
        //1 Display today's date

        LocalDate MyLocalDate=LocalDate.now();
        System.out.println(MyLocalDate);

        //2 Write a method that prints a LocalDate with the following format 12-2005-20 (month-year-day)

        LocalDate MyLocalDate2=LocalDate.of(2005,12,20);
        System.out.println(MyLocalDate2);
        System.out.println(MyLocalDate2.format(DateTimeFormatter.ofPattern("MM-yyyy-dd")));

        //3 Checking if today is 2019-12-22

        LocalDate MyLocalDate3=LocalDate.now();
        LocalDate MyLocalDate4=LocalDate.of(2019,12,22);
        if(MyLocalDate3.isEqual(MyLocalDate4))
        {
            System.out.println("TRUE");
        }
        else
        {
            System.out.println("False");
        }

        //4 Judging whether two dates read from console are equal

        Scanner data=new Scanner(System.in);
        System.out.println("Introduceti prima data:");
        //String data1=data.nextLine();
        System.out.println("Introduceti a doua data:");
        //String data2=data.nextLine();
        //if(data1.equals(data2))
        {
            System.out.println("TRUE");
        }
        //else
        {
            System.out.println("False");
        }

        //5 Write a method that prints local time with the following format HH:mm:ss

        LocalTime MyLocalTime=LocalTime.now();
        System.out.println(MyLocalTime);
        System.out.println(MyLocalTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

        // 6 Write a method that calculates your age based on your birthday. The date of birth must be read from the console
        //        (you can use Period object to compare the date of birth with current date)

        LocalDate DataCurenta=LocalDate.now();
        Scanner DataNasterii=new Scanner(System.in);
        System.out.println("Introduceti data nasterii:");
        String DATA=DataNasterii.nextLine();

    }


}
