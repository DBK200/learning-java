//19. Write a Java program to remove and return the first element of a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise19 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);

        System.out.println(numbers.removeFirst());
        System.out.println(numbers);
    }
}
