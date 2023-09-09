//1 Write a program that uses lambda expressions to filter a list of integers and return only the even numbers.
package com.sessions.session17.HomeworkLambda.Exercise1;
import java.util.ArrayList;
import java.util.List;
@FunctionalInterface
public interface Practice1 {
    List<Integer> filterMyList(List<Integer> list);
}

class Exercise1 {
    public static void main(String[] args) {

        Practice1 practice = list -> list.stream().filter(e -> e % 2 == 0).toList();

        List<Integer> myList = new ArrayList<>();
        myList.add(5);
        myList.add(54);
        myList.add(7);

        System.out.println("Original list: " + myList);
        System.out.println("Even numbers: " + practice.filterMyList(myList));

    }
}