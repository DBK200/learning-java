//6. Write a Java program to clone a tree set list to another tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise6 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(0);
        mySet.add(3);

        TreeSet<Integer> myCloneSet = new TreeSet<>();
        myCloneSet = (TreeSet<Integer>) mySet.clone();
        System.out.println(myCloneSet);
    }
}
