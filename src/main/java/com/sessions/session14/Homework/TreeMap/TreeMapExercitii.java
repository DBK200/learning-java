package com.sessions.session14.Homework.TreeMap;

import com.sessions.session11.AbstractTest.TransportationR;
import com.sessions.session12.homework.Parent;

import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.SortedMap;

public class TreeMapExercitii {
    public static void main(String[] args) {
        //.Write a Java program to associate the specified value with the specified key in a Tree Map
        System.out.println("Exercitiu 1:");
        // Create a TreeMap
        TreeMap<String, Integer> treeMap = new TreeMap<>();

        // Associate a value with a key
        String key = "apple";
        int value = 5;

        treeMap.put(key, value);

        // Retrieve the value associated with the key
        int retrievedValue = treeMap.get(key);

        // Print the key-value pair
        System.out.println("Key: " + key);
        System.out.println("Value: " + retrievedValue);

        //Write a Java program to copy a Tree Map content to another Tree Map
        System.out.println("Exercitiu 2:");
        TreeMap<String, Integer> treeMap1 = new TreeMap<>();
        treeMap1.putAll(treeMap);
        System.out.println("TreeMap ul copiat:" + treeMap1);


        //3.Write a Java program to search a key in a Tree Map.
        System.out.println("Exercitiu 3:");
        TreeMap<String, Integer> treeMap2 = new TreeMap<>();

        treeMap2.put("apple", 10);
        treeMap2.put("banana", 20);
        treeMap2.put("cherry", 15);
        treeMap2.put("date", 5);

        String keyToSearch = "banana";
        if (treeMap2.containsKey(keyToSearch)) {
            System.out.println("Cheia a fost gasita");
        } else {
            System.out.println("Cheia nu a fost gasita");
        }

        //Write a Java program to get all keys from the given a Tree Map.
        System.out.println("Exercitiu 4:");
        TreeMap<String, Integer> treeMap3 = new TreeMap<>();

        treeMap3.put("apple", 10);
        treeMap3.put("banana", 20);
        treeMap3.put("cherry", 15);
        treeMap3.put("date", 5);
        Set<String> keys = treeMap3.keySet();
        for (String el : keys) {
            System.out.println(el);
        }

        //6.Write a Java program to delete all elements from a given Tree Map.
        System.out.println("Exercitiu 5:");
        TreeMap<String, Integer> treeMap4 = new TreeMap<>();

        treeMap4.put("apple", 10);
        treeMap4.put("banana", 20);
        treeMap4.put("cherry", 15);
        treeMap4.put("date", 5);
        treeMap4.clear();
        System.out.println(treeMap4);

        //7.Write a Java program to sort keys in Tree Map by using comparator.
        System.out.println("Exercitiu 6:");
        TreeMap<String, Integer> treeMap5 = new TreeMap<>();

        treeMap5.put("apple", 10);
        treeMap5.put("cherry", 15);
        treeMap5.put("date", 5);
        treeMap5.put("banana", 20);
        treeMap5.comparator();
        System.out.println(treeMap5);

        //8.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println("Exercitiu 7");
        TreeMap<Integer, Integer> treeMap6 = new TreeMap<>();
        treeMap6.put(2, 4);
        treeMap6.put(6, 4);
        treeMap6.put(1, 4);
        treeMap6.put(8, 4);
        treeMap6.put(9, 4);
        Map.Entry<Integer, Integer> greatestEntry = treeMap6.lastEntry();
        Map.Entry<Integer, Integer> leastEntry = treeMap6.firstEntry();
        System.out.println(greatestEntry);
        System.out.println(leastEntry);


        //9.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        System.out.println("Exercitiu 8");
        TreeMap<Integer, Integer> treeMap7 = new TreeMap<>();
        treeMap7.put(2, 4);
        treeMap7.put(6, 7);
        treeMap7.put(1, 1);
        treeMap7.put(8, 3);
        // Obține cea mai mică cheie (primul cheie)
        Map.Entry<Integer, Integer> leastEntry1 = treeMap7.firstEntry();
        System.out.println("Cea mai mică cheie: " + leastEntry1.getKey());

        // Obține cea mai mare cheie (ultima cheie)
        Map.Entry<Integer, Integer> lastEntry = treeMap7.lastEntry();
        System.out.println("Cea mai mare cheie: " + lastEntry.getKey());


        //10.Write a Java program to get a reverse order view of the keys contained in a given map.
        System.out.println("Exercitiu 9");
        TreeMap<Integer, Integer> treeMap8 = new TreeMap<>();
        treeMap8.put(2, 4);
        treeMap8.put(6, 7);
        treeMap8.put(1, 1);
        treeMap8.put(8, 3);
        System.out.println(treeMap8.descendingKeySet());

        //11.Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        System.out.println("Exercitiu 10");
        TreeMap<Integer, Integer> treeMap9 = new TreeMap<>();
        treeMap9.put(2, 4);
        treeMap9.put(6, 7);
        treeMap9.put(1, 1);
        treeMap9.put(8, 3);
        int cheieData = 3;
        // Obține cuplul cheie-valoare asociat celei mai mari chei mai mici sau egale cu cheia dată
        Map.Entry<Integer, Integer> greatestEntry1 = treeMap9.floorEntry(cheieData);

        if (greatestEntry1 != null) {
            System.out.println("Cea mai mare cheie mai mică sau egală cu " + cheieData + " este " + greatestEntry1.getKey() + " cu valoarea " + greatestEntry1.getValue());
        } else {
            System.out.println("Nu există cheie mai mică sau egală cu " + cheieData + " în map.");
        }


    //12.Write a Java program to get the greatest key less than or equal to the given key.
        System.out.println("Exercitiu 11");
        TreeMap<Integer, Integer> treeMap10 = new TreeMap<>();
        treeMap10.put(2, 4);
        treeMap10.put(6, 7);
        treeMap10.put(1, 1);
        treeMap10.put(8, 3);

        Integer givenKey = 3;

        // Get the greatest key less than or equal to the given key
        Integer greatestKey = treeMap10.floorKey(givenKey);

        if (greatestKey != null)
        {
            System.out.println("Cea mai mare cheie mai mică sau egală cu " + givenKey + " este " + greatestKey);
        } else
        {
            System.out.println("Nu există cheie mai mică sau egală cu " + givenKey);
        }


    //13.Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        System.out.println("Exercitiu 13");
        TreeMap<Integer, Integer> treeMap11 = new TreeMap<>();
        treeMap11.put(2, 4);
        treeMap11.put(6, 7);
        treeMap11.put(1, 1);
        treeMap11.put(8, 3);

        Integer givenKey2 = 3;

        // Get the portion of the map whose keys are strictly less than or equal to the given key
        SortedMap<Integer, Integer> portion = treeMap11.headMap(givenKey2, true);

        System.out.println("Portion of the map with keys less than or equal to " + givenKey2 + ":");
        for (Map.Entry<Integer, Integer> entry : portion.entrySet())
        {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

    }

}