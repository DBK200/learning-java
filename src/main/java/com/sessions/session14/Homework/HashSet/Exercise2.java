//2. Write a Java program to iterate through all elements in a hash list.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise2 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();
        digits.add(1);
        digits.add(4);
        digits.add(0);

        for(Integer digit: digits) {
            System.out.println(digit);
        }
    }
}
