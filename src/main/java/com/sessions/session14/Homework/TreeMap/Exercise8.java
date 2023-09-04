//8. Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map
package com.sessions.session14.Homework.TreeMap;
import java.util.TreeMap;

public class Exercise8 {
    public static void main(String[] args) {

        TreeMap<String, Integer> map = new TreeMap<>();
        map.put("Bob", 30);
        map.put("Charlie", 35);
        map.put("Alice", 25);

        System.out.println(map.firstEntry());
        System.out.println(map.lastEntry());
    }
}
