//15. Write a Java program of swap two elements in a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;
import static java.util.Collections.swap;

public class Exercise15 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        swap(numbers, 0, 2);
        System.out.println(numbers);
    }
}
