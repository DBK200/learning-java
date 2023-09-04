//4. Write a Java program to iterate a linked list in reverse order.
package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class Exercise4 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        for(int i = numbers.size() - 1; i >= 0; i--) {
            System.out.println(numbers.get(i));
        }
    }
}
