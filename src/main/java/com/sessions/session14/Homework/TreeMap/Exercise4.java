//4. Write a Java program to search a value in a Tree Map.
package com.sessions.session14.Homework.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise4 {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map.containsValue(30));
        System.out.println(map.containsValue(31));
    }
}
