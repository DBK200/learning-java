//8. Write a Java program to convert a hash set to a tree set.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;
import java.util.TreeSet;

public class Exercise8 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();
        digits.add(1);
        digits.add(4);
        digits.add(0);

        TreeSet<Integer> digitsTree = new TreeSet<>(digits);
        System.out.println(digitsTree);
    }
}
