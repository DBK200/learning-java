//5. Write a Java program to insert the specified element at the specified position in the linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise5 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        numbers.add(2, 8);
        System.out.println(numbers);
    }
}
