package com.sessions.session13.recap;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex22 {
    //Write a program that creates an empty List of integers and prompts the user to enter a series of numbers.
    // Add each number to the list, and then print out the contents of the list.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers to add them to a list and a negative number to show the list");

        List<Integer> list = new ArrayList<>();
        while (true){
            int input = scanner.nextInt();

            if (input < 0){
                break;
            }
            list.add(input);
        }
        System.out.println(list);

    }
}
