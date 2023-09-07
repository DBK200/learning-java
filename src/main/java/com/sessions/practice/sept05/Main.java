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
//        System.out.println("type year to check: ");
//        int year = scanner.nextInt();
//        // year has to be divisible by 400, by 4 but NOT also by 100
//        if(year%4==0 && year%400==0 || year%100 !=0){
//            System.out.println("Leap year");
//        } else{
//            System.out.println("NOT leap year");
//        }

// String || StringBuilder || StringBuffer

        // String str = "mara";
        // str= str.toLowerCase();
        //System.out.println(str);
        //StringBuilder str1 = new StringBuilder(str);
        // StringBuilder reversed = str1.reverse();
        // System.out.println(str1);
        // System.out.println("StringBuilder: " + str1);
        //str1.append(" are mere");
//        System.out.println(str1);
//        String str2 = str1.toString();
//        System.out.println(str2);
        // System.out.println(str1.capacity());
        // System.out.println(str1.reverse());
        // System.out.println(str1.replace(1, 2, "java"));

        String str = "mara";
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }
        System.out.println(rev);

        if(str.equals(rev)){
            System.out.println("palindrom");
        } else{
            System.out.println("not palindrom");
        }
    }
}

