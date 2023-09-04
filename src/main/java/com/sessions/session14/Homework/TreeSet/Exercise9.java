//9. Write a Java program to find the numbers less than 7 in a tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.TreeSet;

public class Exercise9 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet1 = new TreeSet<>();
        mySet1.add(6);
        mySet1.add(0);
        mySet1.add(3);
        mySet1.add(10);

        TreeSet<Integer> mySet2 = (TreeSet) mySet1.headSet(7);
        System.out.println(mySet2);
    }
}
