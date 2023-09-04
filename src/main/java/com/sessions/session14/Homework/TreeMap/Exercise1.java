//1.Write a Java program to associate the specified value with the specified key in a Tree Map.
package com.sessions.session14.Homework.TreeMap;
import java.util.Map;
import java.util.TreeMap;

public class Exercise1 {
    public static void main(String[] args) {

        Map<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map);

    }
}
