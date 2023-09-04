//6. Write a Java program to clone a hash set to another hash set.
package com.sessions.session14.Homework.HashSet;
import java.util.HashSet;

public class Exercise6 {
    public static void main(String[] args) {

        HashSet<Integer> numbers1 = new HashSet<>();
        numbers1.add(1);
        numbers1.add(4);
        numbers1.add(0);

        HashSet<Integer> numbers2 = new HashSet<>(numbers1);
        System.out.println(numbers2);
    }
}
