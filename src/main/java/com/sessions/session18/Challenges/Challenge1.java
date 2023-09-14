package com.sessions.session18.Challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Challenge1 {
    //Filtering: Write a program that uses a stream to filter out
    // all the negative numbers from a list of integers.

    public static void main(String[] args) {

        List<Integer> numList = Arrays.asList(1,2,-23,3,-45,4,-55,5,6,7,8,9,10,-5,-9,-54,-56, 0);
        List<Integer> sortedNums = numList.stream().filter(x -> x >= 0).toList();
        System.out.println(sortedNums);
    }

}
