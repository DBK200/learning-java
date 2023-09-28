package com.sessions.session17.Homework;

import java.util.ArrayList;
import java.util.List;

public class Ex11
{
    // Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
    public static void main(String[] args)
    {
        // Crearea unei liste de numere întregi
        List<Integer> numar = new ArrayList<>();
        numar.add(2);
        numar.add(5);
        numar.add(8);
        numar.add(3);
        numar.add(4);
        IsEven isEven=(Integer a)->a%2==0;
       List<Integer> resolveList=numar.stream().filter((Integer a)->a%2==0).toList();
        System.out.println(resolveList);

    }
}
interface IsEven
{
    boolean isEven(Integer x);
}

