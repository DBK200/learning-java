package com.sessions.practice.sept05;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Write a Java program to convert minutes into years and days.
        // one hour has sixty minutes
//        int minutesInHour = 60;
//        int hoursInDay = 24;
//
//        int minutesInDays = minutesInHour * hoursInDay;
//
//        int daysInYear = 365;
//
//        int minutesInYear = daysInYear * minutesInDays;
//
//        System.out.println("A day has " + minutesInDays + " minutes");
//        System.out.println("An year has " + minutesInYear + " minutes");


     // 2. Write a Java program that takes a year from the user and prints whether it is a leap year or not.
        System.out.println("type year to check: ");
        int year = scanner.nextInt();
        // year has to be divisible by 400, by 4 but NOT also by 100
        if(year%4==0 && year%400==0 || year%100 !=0){
            System.out.println("Leap year");
        } else{
            System.out.println("NOT leap year");
        }



    }
}
