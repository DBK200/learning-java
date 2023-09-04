//5. Write a Java program to test a hash set is empty or not.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise5 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();

        System.out.println(digits.isEmpty());
        digits.add(1);
        System.out.println(digits.isEmpty());
    }
}
