//18. Write a Java program to clone a linked list to another linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise18 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(4);
        numbers1.add(10);
        numbers1.add(3);

        LinkedList<Integer> numbers2 = (LinkedList<Integer>) numbers1.clone();
        System.out.println(numbers2);
    }
}
