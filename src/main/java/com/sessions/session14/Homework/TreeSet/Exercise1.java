//1.Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise1 {
    public static void main(String[] args) {

        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("red");
        mySet.add("blue");
        mySet.add("green");

        System.out.println(mySet);
    }
}
