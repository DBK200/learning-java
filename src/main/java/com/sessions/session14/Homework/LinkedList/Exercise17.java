//17. Write a Java program to join two linked lists.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise17 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(4);
        numbers1.add(10);
        numbers1.add(3);

        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(40);
        numbers2.add(100);
        numbers2.add(30);

        numbers1.addAll(numbers2);
        System.out.println(numbers1);
    }
}
