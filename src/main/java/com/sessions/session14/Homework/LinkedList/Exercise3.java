//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise3 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(8);

        for(int i = 2; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
    }
}
