//5. Write a Java program to check whether a map contains key-value mappings (empty) or not.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;

public class Exercise5 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println(map.isEmpty());
        map.clear();
        System.out.println(map.isEmpty());
    }
}
