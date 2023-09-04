//20. Write a Java program to retrieve but does not remove, the first element of a linked list
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise20 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);

        System.out.println(numbers.getFirst());
        System.out.println(numbers);
    }
}
