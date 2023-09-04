//3. Write a Java program to copy all the mappings from the specified map to another map.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;

public class Exercise3 {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 25);
        map1.put("Bob", 30);
        map1.put("Charlie", 35);

        HashMap<String, Integer> map2 = new HashMap<>(map1);
        System.out.println(map2);
    }
}
