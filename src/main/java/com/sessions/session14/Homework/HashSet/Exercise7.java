//7. Write a Java program to convert a hash set to an array
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise7 {
    public static void main(String[] args) {

        HashSet<Integer> digits = new HashSet<>();
        digits.add(1);
        digits.add(4);
        digits.add(0);

        int[] arr = new int[digits.size()];
        int i = 0;
        for(Integer digit: digits) {
            arr[i++] = digit;
        }
        for(int number: arr) {
            System.out.println(number);
        }
    }
}
