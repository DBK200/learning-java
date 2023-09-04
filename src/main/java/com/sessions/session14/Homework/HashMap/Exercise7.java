//7. Write a Java program to test if a map contains a mapping for the specified key.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;

public class Exercise7 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println(map.containsKey("Alice"));
        System.out.println(map.containsKey("Alic"));
    }
}
