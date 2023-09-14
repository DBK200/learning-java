package com.sessions.session17.Homework;

import java.util.ArrayList;
import java.util.List;

class Exercise1{
    //Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
    public static void main(String[] args) {
        List<Integer> number = new ArrayList<>();
        number.add(2);
        number.add(5);
        number.add(8);
        number.add(3);
        number.add(4);
        IsEven isEven = (Integer a) -> a%2==0;
        List<Integer> resolveList = number.stream().filter((Integer a) -> a%2==0).toList();
        System.out.println(resolveList);

    }
}


        interface IsEven
        {

            boolean isEven(Integer x);
        }



