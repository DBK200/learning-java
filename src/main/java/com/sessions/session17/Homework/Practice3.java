package com.sessions.session17.Homework;

import java.util.Arrays;
import java.util.List;

public class Practice3 {
    //Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("abc", "ujcv", "beav");
        List<String> sortedList = stringList.stream().sorted().toList();
        System.out.println(sortedList);
    }
}
