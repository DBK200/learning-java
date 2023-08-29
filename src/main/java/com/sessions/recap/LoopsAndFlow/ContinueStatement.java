package com.sessions.recap.LoopsAndFlow;

import java.util.Scanner;

public class ContinueStatement {

//    Continue Statement: Write a program that prompts the user to enter a series of
//    numbers and calculates the sum of the even numbers using a continue statement to
//    skip over the odd numbers.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum=0;

        while (true){
            int number =Integer.parseInt( scanner.nextLine());
            if (number==0)
                break;
            if(number%2!=0)
                continue;
            sum+=number;

        }
        System.out.println("The sum of the even numbers is "+sum);
    }
}
