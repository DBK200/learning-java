//5. Write a Java program to get the first and last elements in a tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise5 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(0);
        mySet.add(3);

        System.out.println(mySet);
        System.out.println(mySet.first());
        System.out.println(mySet.last());
    }
}
