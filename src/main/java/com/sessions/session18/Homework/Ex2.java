package com.sessions.session18.Homework;

import java.util.Arrays;
import java.util.List;

public class Ex2 {
    public static void main(String[] args) {
       //Mapping: Write a program that uses a stream to transform a list of strings to uppercase and then sort them in alphabetical order.

        List<String> listOfStrings = Arrays.asList("hijk", "abc", "defg");
        List<String> sortedList = listOfStrings.stream().map(x -> x.toUpperCase()).sorted().toList();
        System.out.println(sortedList);
    }
}
