//3 Write a program that uses lambda expressions to calculate the sum of all the elements in a list of integers.
package com.sessions.session17.HomeworkLambda.Exercise3;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
public interface Practice3 {
    Integer calculateSum(List<Integer> list);
}

class Exercise3 {
    public static void main(String[] args) {

        Practice3 practice = list -> list.stream().reduce(0, (a, b) -> a + b);

        List<Integer> myList = new ArrayList<>();
        myList.add(8);
        myList.add(2);
        myList.add(-3);

        System.out.println("List: " + myList);
        System.out.println("Sum: " + practice.calculateSum(myList));
    }
}