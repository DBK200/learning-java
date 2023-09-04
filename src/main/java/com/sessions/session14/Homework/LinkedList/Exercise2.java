//2. Write a Java program to iterate through all elements in a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise2 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);

        for(Integer number: numbers) {
            System.out.println(number);
        }
    }

}
