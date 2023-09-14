package com.sessions.session18.Challenges;

import java.util.List;

public class Challenge3 {
    //Reducing: Write a program that uses a stream to
    // calculate the product of all the elements in a list of integers.

    public static void main(String[] args) {
        List<Integer> integerList = List.of(1,4,6,8,2,10);
        List<Integer> productList = integerList.stream().reduce((x ,y)-> x * y).stream().toList();
        System.out.println(productList);
    }
}
