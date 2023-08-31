package com.sessions.session13.recap;

import java.util.*;

public class Ex24 {

    //Write a program that creates a List of integers and sorts it in ascending order using the Collections.sort() method.
    // Print out the sorted list.


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        System.out.println("Enter some numbers and a negative number to quit: ");

        while (true){
            int input = scanner.nextInt();

            if (input < 0){
                break;
            }
            list.add(input);
        }
        Collections.sort(list);
        System.out.println(list);

    }
}
