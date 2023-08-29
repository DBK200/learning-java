package com.sessions.recap.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ListSorting {

//    List Sorting: Write a program that creates a List of integers and sorts it in
//    ascending order using the Collections.sort() method. Print out the sorted list.

    public static void main(String[] args) {
        List<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(3);
        numbers.add(4);
        numbers.add(2);
        numbers.add(6);
        numbers.add(5);
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
    }
}
