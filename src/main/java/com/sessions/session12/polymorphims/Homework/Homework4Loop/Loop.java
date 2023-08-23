package com.sessions.session12.polymorphims.Homework.Homework4Loop;

import java.util.Scanner;

public class Loop {

    public static void main(String[] args) {

        //1.Take 10 integers from keyboard using loop and print their average value on the screen.

//        Scanner scanner = new Scanner(System.in);
//        int addedNums = 0;
//        for(int i = 0; i < 10; i++){
//            addedNums = addedNums + scanner.nextInt();
//        }
//        System.out.println(addedNums);

        //2.Print the following patterns using loop :
        //a.
//        for (int i = 1; i < 5; i++) {
//            for (int z = 0; z < i; z++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        //b.
//        int a = 3;
//        for (int i = 1; i <= a; i++) {
//            for (int z = 1; z <= a - i; z++) {
//                System.out.print(" ");
//            }
//            for (int z = 1; z <= 2 * z - 1; z++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//        for (int i = a - 1; i >= 1; i--) {
//            for (int z = 1; z <= a - i; z++) {
//                System.out.print(" ");
//            }
//            for (int z = 1; z <= 2 * i - 1; z++) {
//                System.out.print("*");
//            }
//            System.out.println();

            //c.
//            int a = 4;
//
//            for(int i = 1; i <= a; i++){
//                for (int z = 1; z < i ; z++){
//                    System.out.print(" ");
//                }
//                for (int z = 1;z <= (a - i + 1); z++){
//                    System.out.print("1");
//                    if(z < (a -1 + 1)){
//                        System.out.print("0");
//                    }
//                }
//                System.out.println();


        //3.Print multiplication table of 24, 50 and 29 using loop.

//        int num1 = 24;
//        int num2 = 50;
//        int num3 = 29;
//
//        for (int i = 0; i < 10; i++){
//            System.out.println(num1 * i);
//        }
//        System.out.println();
//        for (int i = 0; i < 10; i++){
//            System.out.println(num2 * i);
//        }
//        System.out.println();
//        for(int i = 0; i < 10; i++){
//            System.out.println(num3 * i);
//        }


        //4.Print ASCII values and their equivalent characters. ASCII value vary from 0 to 255.

//        for (int i = 0; i <= 255; i++){
//            System.out.println(i + " " + (char) i);


        //5.Write a Java program to calculate factorial of a number.

//        Scanner scanner = new Scanner(System.in);
//        int factorial = scanner.nextInt();
//        int fact = 1;
//        for(int i = factorial; i >= 1; i--){
//            fact = fact*i;
//
//        }
//        System.out.println(fact);


        //6.Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers

//        Scanner scanner = new Scanner(System.in);
//        int num1 = scanner.nextInt();
//        int num2 = scanner.nextInt();
//
//        int commonDivisor = 1;
//
//        int smallerNum = Math.min(num1, num2);
//
//        for (int i=1; i <= smallerNum; i ++){
//            if(num1 % i ==0 && num2 % i ==0){
//                commonDivisor = i;
//            }
//        }
//        System.out.println(commonDivisor);

        //7. write an infinite loop

//        int a = 1;
//        for (int i = 2; i > a; i++){
//            System.out.println(i);
//        }

    }
}
