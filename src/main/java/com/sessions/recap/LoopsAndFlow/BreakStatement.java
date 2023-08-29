package com.sessions.recap.LoopsAndFlow;

import java.util.Scanner;

public class BreakStatement {

//    Break Statement: Write a program that prompts the user to enter a series of numbers
//    until they enter a negative number. Calculate the sum of the positive numbers using
//        a break statement to exit the loop when a negative number is entered.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int sum=0;

        while (true){
            int number =Integer.parseInt( scanner.nextLine());
            if(number<0)
                break;
            sum+=number;

        }
        System.out.println("sum of the positive numbers is "+sum);
    }
}
