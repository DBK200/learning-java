//10. Write a Java program to compare two hash set.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise10 {
    public static void main(String[] args) {

        HashSet<Integer> digits1 = new HashSet<>();
        digits1.add(1);
        digits1.add(4);
        digits1.add(0);

        HashSet<Integer> digits2 = new HashSet<>();
        digits2.add(1);
        digits2.add(4);
        digits2.add(0);

        System.out.println(digits1.equals(digits2));
    }
}
