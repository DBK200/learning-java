//1. Write a Java program to append the specified element to the end of a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise1 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);

        numbers.addLast(6);
        System.out.println(numbers);
    }
}
