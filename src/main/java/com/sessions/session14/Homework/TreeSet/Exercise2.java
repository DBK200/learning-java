//2. Write a Java program to iterate through all elements in a tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise2 {
    public static void main(String[] args) {

        TreeSet<String> mySet = new TreeSet<>();
        mySet.add("red");
        mySet.add("blue");
        mySet.add("green");

        for(String color: mySet) {
            System.out.println(color);
        }
    }
}
