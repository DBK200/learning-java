//11. Write a Java program to get a set view of the keys contained in this map
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;
import java.util.Set;

public class Exercise11 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        Set<String> set = map.keySet();
        System.out.println(set);
    }
}
