//9. Write a Java program to insert some elements at the specified position into a linked list.
package com.sessions.session14.Homework.LinkedList;
import java.util.LinkedList;

public class Exercise9 {
    public static void main(String[] args) {

        LinkedList<Integer> numbers1 = new LinkedList<>();
        numbers1.add(4);
        numbers1.add(10);
        numbers1.add(3);
        numbers1.add(7);

        LinkedList<Integer> numbers2 = new LinkedList<>();
        numbers2.add(14);
        numbers2.add(18);

        numbers1.addAll(1, numbers2);
        System.out.println(numbers1);

    }
}
