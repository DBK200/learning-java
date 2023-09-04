//3. Write a Java program to get the number of elements in a hash set.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise3 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();
        digits.add(1);
        digits.add(4);
        digits.add(0);

        System.out.println(digits.size());
    }
}
