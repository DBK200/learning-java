package com.sessions.practice.sept05;

import java.math.BigDecimal;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

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

//        String str = "mara";
//        String rev = "";
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev = rev + str.charAt(i);
//        }
//        System.out.println(rev);
//
//        if(str.equals(rev)){
//            System.out.println("palindrom");
//        } else{
//            System.out.println("not palindrom");
//        }

        // regex
//        Pattern pattern = Pattern.compile("w3schools", Pattern.CASE_INSENSITIVE);   // the patter is created using the compile() method
//                                                                                        // the second parameter is optional
//
//        Matcher matcher = pattern.matcher("Visit W3Schools!"); // the matcher() method is used to search for the pattern in a string
//                                                                    // returns a Matcher object which contains information about the search that was performed
//        boolean matchFound = matcher.find();
//        if(matchFound){
//            System.out.println("Found");
//        } else{
//            System.out.println("not found");
//        }

        // Regex exercices from w3resources
        // 1. Write a Java program to check whether a string contains only a certain
        // set of characters (in this case a-z, A-Z and 0-9)
//        String strToCheck = "5566";
//        Pattern pattern = Pattern.compile("[0-9]+");
//        Matcher matcher = pattern.matcher(strToCheck);
//
//        boolean result = matcher.matches();
//        System.out.println(result);

        // for a-z
//        String strToCheck = "abcde";
//        Pattern pattern = Pattern.compile("[a-z]+");
//        Matcher matcher = pattern.matcher(strToCheck);
//        boolean result = matcher.matches() && strToCheck.length()==5;
//        System.out.println(result);


        // for A-Z
//        String strToCheck = "ABCD";
//        Pattern pattern = Pattern.compile("[A-Z]+");
//        Matcher matcher = pattern.matcher(strToCheck);
//        boolean result = matcher.matches();
//        System.out.println(result);

        // 2. Write a Java program that matches a string that has a p followed by zero or more q's
//        String str = "p";
//        Pattern pattern = Pattern.compile("pq*");   // * mai multi de q
//        Matcher matcher = pattern.matcher(str);
//        boolean result = matcher.matches();
//        System.out.println(result);


        // daca este a dupa b
//        String str = "abb";
//        Pattern pattern = Pattern.compile("[ab*]+");
//        Matcher matcher = pattern.matcher(str);
//        boolean result = matcher.matches();
//        System.out.println(result);

        // 3. Write a Java program to find the sequence of one upper case letter followed by lower case letters.
        String str ="aabb";
        //Pattern pattern = Pattern.compile("[A-Z][a-z]+");
       // Matcher matcher = pattern.matcher(str);
//        boolean result = str.matches("[a-z]+");
//        System.out.println(result);
        // calculate the area of a spherical surface with a 20 decimal precision
//        BigDecimal pi = new BigDecimal("3.14159265358979323846");
//        System.out.println("PI with 20 decimals: " + pi);
//        // surface area = 4 * pi * r^2;
//
//        // because big decimal is an object, we cannot use +, -, *, /.
//        // we have to use add(), subtract(), multiply, etc
//        // bigdecimal can only have other operations with the same data type. It does NOT allow int, double, float..
//        BigDecimal radius = new BigDecimal(123212);
//
//        // square of radius
//        radius = radius.multiply(radius);
//        // 4r^2
//        radius = radius.multiply(new BigDecimal(4));
//        BigDecimal surfaceArea = radius.multiply(pi);
//        System.out.println("Surface area with the given data: " + surfaceArea);
    }
}

