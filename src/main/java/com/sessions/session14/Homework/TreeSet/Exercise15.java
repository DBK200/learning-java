//15. Write a Java program to retrieve and remove the last element of a tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise15 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(0);
        mySet.add(3);
        mySet.add(10);

        System.out.println(mySet);
        System.out.println(mySet.pollLast());
        System.out.println(mySet);
    }
}