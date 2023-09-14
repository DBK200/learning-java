package com.sessions.session18.Homework;

import java.util.Arrays;
import java.util.List;

public class Ex3Reducing
{
    //Reducing: Write a program that uses a stream to calculate
    // the product of all the elements in a list of integers.
    public static void main(String[] args)
    {
        List<Integer> numbers=Arrays.asList(3,2,6,4,8,10,2);
        System.out.println("List:"+numbers);
        int product=numbers.stream().reduce(1, (a, b) -> a * b);
        System.out.println("Product:"+product);
    }
}
