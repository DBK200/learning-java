//10. Write a Java program to get a reverse order view of the keys contained in a given map.
package com.sessions.session14.Homework.TreeMap;
import java.util.TreeMap;

public class Exercise10 {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map.descendingKeySet());
    }
}
