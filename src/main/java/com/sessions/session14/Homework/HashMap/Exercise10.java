//10. Write a Java program to get the value of a specified key in a map.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;

public class Exercise10 {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();
        map.put("Alice", 25);
        map.put("Bob", 30);
        map.put("Charlie", 35);

        System.out.println(map.get("Bob"));
    }
}
