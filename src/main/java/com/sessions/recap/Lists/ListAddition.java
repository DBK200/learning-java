package com.sessions.recap.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListAddition {

//    List Addition: Write a program that creates an empty List of integers and
//    prompts the user to enter a series of numbers. Add each number to the list,
//    and then print out the contents of the list.

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        while (scanner.hasNextInt()){
            int nr=scanner.nextInt();//enter a non-integer to stop
            numbers.add(nr);

        }
        System.out.println(numbers);
    }
}
