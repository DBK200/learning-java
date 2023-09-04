//9. Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
package com.sessions.session14.Homework.TreeMap;
import java.util.TreeMap;

public class Exercise9 {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map.firstKey());
        System.out.println(map.lastKey());
    }
}
