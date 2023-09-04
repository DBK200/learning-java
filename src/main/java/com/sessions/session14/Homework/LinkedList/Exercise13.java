//13. Write a Java program to remove first and last element from a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise13 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println(numbers);
    }
}
