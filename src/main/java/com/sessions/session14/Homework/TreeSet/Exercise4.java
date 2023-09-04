//4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
package com.sessions.session14.Homework.TreeSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Exercise4 {
    public static void main(String[] args) {

        TreeSet<Integer> mySet = new TreeSet<>();
        mySet.add(6);
        mySet.add(0);
        mySet.add(3);

        System.out.println("Original: " + mySet);
        Iterator<Integer> iterator = mySet.descendingIterator();
        System.out.println("Reversed order: ");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
