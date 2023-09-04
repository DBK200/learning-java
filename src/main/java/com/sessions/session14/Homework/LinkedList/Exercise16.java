//16. Write a Java program to shuffle the elements in a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;
import static java.util.Collections.shuffle;

public class Exercise16 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);

        System.out.println("Original: " + numbers);
        shuffle(numbers);
        System.out.println("Shuffled: " + numbers);
    }
}
