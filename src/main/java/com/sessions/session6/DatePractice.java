package com.sessions.session6;

//import java.time.LocalDate;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

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

        String myDateAsString = "1990-10-11";
        LocalDate myLocalDateFromString = LocalDate.parse(myDateAsString);
        System.out.println("Local Date from String to Date: " + myLocalDateFromString);

        String myDateAsString2 = "01.06.2001";
        LocalDate myLocalDateFromString2 = LocalDate.parse(myDateAsString2 ,DateTimeFormatter.ofPattern("dd.MM.yyyy"));
        System.out.println("Local Date from String to Date with '.': " + myLocalDateFromString2.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));



    }
}
