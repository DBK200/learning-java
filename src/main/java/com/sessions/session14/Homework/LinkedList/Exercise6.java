//6. Write a Java program to insert elements into the linked list at the first and last position.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise6 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        LinkedList<Integer> first = new LinkedList<>();
        first.add(2);
        first.add(7);

        LinkedList<Integer> last = new LinkedList<>();
        last.add(20);
        last.add(70);

        numbers.addAll(0, first);
        numbers.addAll(last);
        System.out.println(numbers);
    }
}
