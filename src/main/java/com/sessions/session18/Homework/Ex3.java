package com.sessions.session18.Homework;

import java.util.Arrays;
import java.util.List;

public class Ex3 {
    public static void main(String[] args) {
        //Reducing: Write a program that uses a stream to calculate the product of all the elements in a list of integers.

        List<Integer> calculateIntegers = Arrays.asList(1, 2, 3, 4, 5);
        Integer sum = calculateIntegers.stream().reduce(0, (a, b)-> a + b );
        System.out.println(sum);
    }
}
