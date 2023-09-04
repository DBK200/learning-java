//9. Write a Java program to create a set view of the mappings contained in a map.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercise9 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        System.out.println(set);
    }
}
