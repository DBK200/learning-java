//12. Write a Java program to remove a specified element from a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise12 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        numbers.remove((Integer) 10);
        System.out.println(numbers);
    }
}
