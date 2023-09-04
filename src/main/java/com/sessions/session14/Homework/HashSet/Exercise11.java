//11. Write a Java program to compare two sets and retain elements which are same on both sets.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise11 {
    public static void main(String[] args) {

        HashSet<Integer> digits1 = new HashSet<>();
        digits1.add(1);
        digits1.add(4);
        digits1.add(6);
        digits1.add(9);
        digits1.add(0);

        HashSet<Integer> digits2 = new HashSet<>();
        digits2.add(1);
        digits2.add(4);
        digits2.add(3);
        digits2.add(0);
        digits2.add(2);

        System.out.println(digits1.retainAll(digits2));
        System.out.println(digits1);
    }
}
