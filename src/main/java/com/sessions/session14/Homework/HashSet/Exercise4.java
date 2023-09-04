//4. Write a Java program to empty a hash set.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise4 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();
        digits.add(1);
        digits.add(4);
        digits.add(0);

        digits.removeAll(digits);
        System.out.println(digits);
    }
}
