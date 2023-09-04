//10. Write a Java program to get the first and last occurrence of the specified elements in a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise10 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        System.out.println(numbers.indexOf(10));
        System.out.println(numbers.lastIndexOf(10));
    }
}
