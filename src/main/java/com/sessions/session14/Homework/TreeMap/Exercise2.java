//2. Write a Java program to copy a Tree Map content to another Tree Map.
package com.sessions.session14.Homework.TreeMap;

import java.util.Map;
import java.util.TreeMap;

public class Exercise2 {
    public static void main(String[] args) {

        Map<String, Integer> map1 = new TreeMap<>();
        map1.put("Bob", 30);
        map1.put("Charlie", 35);
        map1.put("Alice", 25);

        Map<String, Integer> map2 = new TreeMap<>(map1);
        System.out.println(map2);

    }
}
