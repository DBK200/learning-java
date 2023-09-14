package com.sessions.session18.Homework;

import java.util.Arrays;
import java.util.List;

public class Ex1Filtering
{
    //Filtering: Write a program that uses a stream to filter out all the negative numbers from a list of integers.
    public static void main(String[] args)
    {
        List<Integer> numbers= Arrays.asList(4,2,34,-3,9,-23,3,-6,2,1,-21);
        System.out.println("Lista normala:"+numbers);
        List<Integer> resultList=numbers.stream().filter(n -> n <0).toList();
        System.out.println(resultList);
    }
}

