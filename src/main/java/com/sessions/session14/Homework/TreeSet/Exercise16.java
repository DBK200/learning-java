//16. Write a Java program to remove a given element from a tree set
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise16 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(0);
        mySet.add(3);
        mySet.add(10);

        System.out.println(mySet);
        mySet.remove(3);
        System.out.println(mySet);

    }
}
