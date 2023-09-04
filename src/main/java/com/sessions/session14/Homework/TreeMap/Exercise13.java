//13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
package com.sessions.session14.Homework.TreeMap;
import java.util.TreeMap;

public class Exercise13 {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map.headMap("Bob"));
    }
}
