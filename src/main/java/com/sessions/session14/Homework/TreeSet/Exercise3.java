//3. Write a Java program to add all the elements of a specified tree set to another tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise3 {
    public static void main(String[] args) {

        TreeSet<String> set1 = new TreeSet<>();
        set1.add("red");
        set1.add("blue");
        set1.add("green");

        TreeSet<String> set2 = new TreeSet<>();
        set2.addAll(set1);
        System.out.println(set2);
    }
}
