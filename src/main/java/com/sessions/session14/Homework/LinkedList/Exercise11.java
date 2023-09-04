//11. Write a Java program to display the elements and their positions in a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise11 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(4);
        numbers.add(10);
        numbers.add(3);
        numbers.add(5);
        numbers.add(10);

        for(int i = 0; i < numbers.size(); i++) {
            System.out.println("Element " + numbers.get(i) + " is at position " + i);
        }
    }
}
