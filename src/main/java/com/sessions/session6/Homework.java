package com.sessions.session6;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class inputDate {
    int year,month,day;
    String inDate;

}

public class Homework {
    public static void main(String[] args) {
        //1
        System.out.println("1. Display today's date : ");
        System.out.println(LocalDate.now());

        //2
        System.out.println("2. Display year, month, day information");
        System.out.println(LocalDate.now().getDayOfYear());
        System.out.println(LocalDate.now().getDayOfMonth());

        //3
        System.out.println("3. Create a specific date");
        LocalDate localDate = LocalDate.of(2025,8,19);
        System.out.println(localDate);

        //4
        Scanner scan2 = new Scanner(System.in);
        System.out.println("Start ex 4? Y/N");
        boolean start = false;
        String s = scan2.nextLine();
        if(s.equalsIgnoreCase("y")){start =true;}
        else {start = false;}

        while(start) {


            Scanner scan = new Scanner(System.in);
            inputDate data1 = new inputDate();

            System.out.println("Introduceti anul in formatul YYYY: pentru data1");
            data1.year = scan.nextInt();
            System.out.println("Introduceti luna in formatul MM: pentru data1");
            data1.month = scan.nextInt();
            System.out.println("Introduceti ziua in formatul DD: pentru data1");
            data1.day = scan.nextInt();
            data1.inDate = data1.year + "-" + data1.month + "-" + data1.day;
            System.out.println(data1.inDate);

            inputDate data2 = new inputDate();

            System.out.println("Introduceti anul in formatul YYYY: pentru data2");
            data2.year = scan.nextInt();
            System.out.println("Introduceti luna in formatul MM: pentru data2");
            data2.month = scan.nextInt();
            System.out.println("Introduceti ziua in formatul DD: pentru data2");
            data2.day = scan.nextInt();
            data2.inDate = data2.year + "-" + data2.month + "-" + data2.day;
            System.out.println(data2.inDate);

            LocalDate date1 = LocalDate.parse(data1.inDate);
            LocalDate date2 = LocalDate.parse(data2.inDate);

            if (date1.equals(date2)) {
                System.out.println("Dates are the same");
            } else System.out.println("Dates are different");
            break;
        }

        //5
        System.out.println("5. Checking if today is 2019-12-10...");
       if(LocalDate.now().equals(LocalDate.of(2019,12,10))){
           System.out.println("Do you have a time machine?");
       } else {
           System.out.println("Today is not 2019-12-10");
       }

       //6
        System.out.println("6. Getting the current time");
        System.out.println(LocalTime.now());






    }
}
