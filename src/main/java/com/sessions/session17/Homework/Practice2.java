package com.sessions.session17.Homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@FunctionalInterface
public interface Practice2 {
    //Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
    Integer myList(List<Integer> list);

}

class Exercise2 {
    public static void main(String[] args) {
        Practice2 practice2 = list -> list.stream().reduce(0, (x, y) -> x + y);
        ArrayList<Integer> myList2 = new ArrayList<>();
        myList2.add(7);
        myList2.add(8);
        myList2.add(10);
        System.out.println(myList2);

        System.out.println("Sum is " +practice2.myList(myList2));
    }
}