//2 Write a program that uses lambda expressions to sort a list of strings in alphabetical order.
package com.sessions.session17.HomeworkLambda.Exercise2;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Practice2 {
    List<String> sortList (List<String> list);
}

class Exercise2 {
    public static void main(String[] args) {

        Practice2 practice = list -> list.stream().sorted().toList();

        List<String> myList = new ArrayList<>();
        myList.add("adc");
        myList.add("tgw");
        myList.add("dru");

        System.out.println(myList);
        System.out.println(practice.sortList(myList));
    }
}