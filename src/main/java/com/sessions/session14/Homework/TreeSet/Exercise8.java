//8. Write a Java program to compare two tree sets.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise8 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet1 = new TreeSet<>();
        mySet1.add(6);
        mySet1.add(0);
        mySet1.add(3);

        TreeSet<Integer> mySet2 = new TreeSet<>();
        mySet2.add(6);
        mySet2.add(0);
        mySet2.add(5);

        System.out.println(mySet1.equals(mySet2));
    }
}
