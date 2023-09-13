package com.sessions.session17;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

interface Exercise1{
//    Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
    List<Integer> isEven(List<Integer> x);
}

interface Exercise2{
//    2 Write a program that uses lambda expressions to sort a list of strings in alphabetical order.

    List<String> alphabeticalOrder(List<String > strings);
}

interface Exercise3{
//    3 Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.

    int sumLambda(int[] x);
}

public class Homework17 {

    public static void main(String[] args) {

//        EX1

//        List<Integer> numbers=new ArrayList<>();
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        System.out.println(numbers);
//        Exercise1 evenNumbers= nrList->{
//            List<Integer> evenList=new ArrayList<>();
//            for (int i:nrList)
//                if(i%2==0)
//                    evenList.add(i);
//            return evenList;
//        };
//        List<Integer> evenResult=evenNumbers.isEven(numbers);
//        System.out.println(evenResult);


//        Ex2
//        List<String> list=new ArrayList<>();
//        list.add("shdtj");
//        list.add("asghj");
//        list.add("mhfj");
//        list.add("erhj");
//        list.add("jfmkk");
//        System.out.println(list);
//        Exercise2 strings=stringsList->{
//            List<String> list1=stringsList;
//            Collections.sort(list1);
//            return list1;
//        };
//        List<String> sortedList=strings.alphabeticalOrder(list);
//        System.out.println(sortedList);

//        Ex3
//        int[] numbers={1,23,5,76};
//        System.out.println(numbers);
//        Exercise3 suma= nrList->{
//            int s=0;
//            for (int i:nrList)
//                s+=i;
//            return s;
//        };
//        System.out.println(suma.sumLambda(numbers));

    }
}
