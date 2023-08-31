package com.sessions.session14.TreeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        TreeMap<String, Integer> ages = new TreeMap<>();

        ages.put("Mark", 18);
        ages.put("Mike", 36);
        ages.put("Anna", 20);
        System.out.println(ages);

        Map<String, Integer> ages2 = new TreeMap<>();
        ages2.putAll(ages);
        System.out.println(ages2);

        System.out.println(ages.containsKey("Mike"));
        System.out.println(ages.containsValue(18));

        Set<String> keys = ages.keySet();
        System.out.println("All Keys in the TreeMap: " + keys);

        ages2.clear();
        System.out.println(ages2);

        Set<String> sortedKeys = ages.keySet();
        System.out.println("Keys sorted in descending order: " + sortedKeys);

        Map.Entry<String, Integer> greatestEntry = ages.lastEntry();
        Map.Entry<String, Integer> leastEntry = ages.firstEntry();

        System.out.println("Greatest Key-Value: " + greatestEntry);
        System.out.println("Least Key-Value: " + leastEntry);

        String firstKey = ages.firstKey();
        String lastKey = ages.lastKey();

        System.out.println("First Key: " + firstKey);
        System.out.println("Last Key: " + lastKey);

        NavigableSet<String> reverseKeys = ages.descendingKeySet();
        System.out.println("Reverse Order View of Keys: " + reverseKeys);


        Map.Entry<String, Integer> greatestKey = ages.floorEntry("Anna");
        System.out.println(greatestKey);

        String greatestKey2 = ages.floorKey("Anna");
        System.out.println(greatestKey2);

        SortedMap<String, Integer> portion = ages.headMap("Mike");
        System.out.println(portion);

        SortedMap<String, Integer> portion2 = ages.headMap("Mike", true);
        System.out.println(portion2);

        String leastKey = ages.higherKey("Mark");
        System.out.println(leastKey);

        Map.Entry<String, Integer> greatestEntry2 = ages.lowerEntry("Mike");
        System.out.println(greatestEntry2);

        String greatestKey3 = ages.lowerKey("Mike");
        System.out.println(greatestKey3);

    }

}
