package com.sessions.session14.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Map<String, Integer> ages = new HashMap<>();

        // Associate values with keys
        ages.put("Alice", 15);
        ages.put("Bob", 30);
        ages.put("Charlie", 46);

        System.out.println(ages);
        System.out.println(ages.size());
        Map<String, Integer> ages2 = new HashMap<>();
        ages2.putAll(ages);
        System.out.println(ages2);
        ages2.clear();
        System.out.println(ages2);

        System.out.println(ages.isEmpty());

        Map<String, Integer> ages3 = new HashMap<>(ages);

        System.out.println(ages3);

        System.out.println(ages.containsKey("Bob"));
        System.out.println(ages.containsValue(30));

        Set<Map.Entry<String, Integer>> entrySet = ages.entrySet();
        System.out.println(entrySet);

        Set<String> keysSet = ages.keySet();
        System.out.println("Set View of Keys: " + keysSet);

        Collection<Integer> valuesCollection = ages.values();
        System.out.println("Collection View of Values: " + valuesCollection);
    }
}
