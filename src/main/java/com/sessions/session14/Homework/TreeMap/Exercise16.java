//16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
package com.sessions.session14.Homework.TreeMap;
import java.util.TreeMap;

public class Exercise16 {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map.floorEntry("Bob"));
    }
}
