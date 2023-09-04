//2. Write a Java program to count the number of key-value (size) mappings in a map.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;

public class Exercise2 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println(map.size());
    }
}
