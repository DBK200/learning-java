//9. Write a Java program to convert a hash set to a List/ArrayList.
package com.sessions.session14.Homework.HashSet;
import java.util.ArrayList;
import java.util.HashSet;

public class Exercise9 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();
        digits.add(1);
        digits.add(4);
        digits.add(0);

        ArrayList<Integer> digitsArrayList = new ArrayList<>(digits);
        System.out.println(digitsArrayList);
    }
}
