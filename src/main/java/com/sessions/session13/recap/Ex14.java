package com.sessions.session13.recap;

import java.util.Scanner;

public class Ex14 {

    //Write a program that prompts the user to enter a series of numbers and calculates the sum of the
    // even numbers using a continue statement to skip over the odd numbers.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int sum = 0;

        while (true){
            int num = scanner.nextInt();

            if (num < 0){
                break;
            }
            if (num % 2 ==0){
                sum += num;
            }
        }
        System.out.println(sum);
    }
}
