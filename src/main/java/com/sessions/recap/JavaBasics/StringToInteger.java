package com.sessions.recap.JavaBasics;

import java.util.Scanner;

public class StringToInteger {
//    String to Integer: Write a program that prompts the user to enter a string representing
//    an integer value. Convert the string to an int using the Integer.parseInt() method.
//    What happens if the string cannot be parsed as an integer? How can you handle this scenario?

    public static void main(String[] args) {

        int n;

        Scanner myObj = new Scanner(System.in);
        String number = myObj.nextLine();

        System.out.println(number);//sout String

        n=Integer.parseInt(number);

        System.out.println(n);//sout Int
        n=n-1;
        System.out.println(n);



    }
}
