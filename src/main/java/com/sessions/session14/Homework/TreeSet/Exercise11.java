//11. Write a Java program to get the element in a tree set which is less than or equal to the given element.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise11 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(0);
        mySet.add(3);
        mySet.add(10);

        System.out.println(mySet.floor(6));
    }
}
