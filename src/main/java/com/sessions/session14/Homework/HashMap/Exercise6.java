//6. Write a Java program to get a shallow copy of a HashMap instance.
package com.sessions.session14.Homework.HashMap;
import java.util.HashMap;

public class Exercise6 {
    public static void main(String[] args) {

        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("Alice", 25);
        map1.put("Bob", 30);
        map1.put("Charlie", 35);

        HashMap<String, Integer> map2 = (HashMap<String, Integer>) map1.clone();
        System.out.println(map2);
    }
}
