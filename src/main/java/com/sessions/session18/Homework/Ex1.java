package com.sessions.session18.Homework;

import java.util.Arrays;
import java.util.List;

public class Ex1 {
    public static void main(String[] args) {
        //Filtering: Write a program that uses a stream to filter out all the negative numbers from a list of integers.
        List<Integer> number = Arrays.asList(0, -1, -3, 4, 5, -8);
        List<Integer> filteredList = number.stream().filter(x -> x >= 0).toList();
        System.out.println(filteredList);

    }
}
