package com.sessions.homework13plus.h13.TreeMap;

import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        //1.Write a Java program to associate the specified value with the specified key in a Tree Map.
        TreeMap<Integer, String> mathScore = new TreeMap<>();
        mathScore.put(10,"John");
        mathScore.put(8,"Giovanni");
        mathScore.put(7,"Giorgio");
        mathScore.put(3,"Vasile");
        mathScore.put(6,"Jordan");
        mathScore.put(9,"Alex");

        //2.2. Write a Java program to copy a Tree Map content to another Tree Map.
        TreeMap<Integer, String> mathScoreBackup = new TreeMap<>();
        mathScoreBackup.putAll(mathScore);

        //3. Write a Java program to search a key in a Tree Map.
        mathScore.containsKey(10);

        //4.Write a Java program to search a value in a Tree Map.
        mathScore.containsValue("John");

        //5.Write a Java program to get all keys from the given a Tree Map.
        System.out.println(mathScore.keySet());

        //6. Write a Java program to delete all elements from a given Tree Map.
        mathScoreBackup.clear();

        //7.Write a Java program to sort keys in Tree Map by using comparator.
        System.out.println(mathScore.comparator());

        //8.Write a Java program to get a key-value mapping associated with the greatest key and the least key in a map.
        System.out.println(mathScore.firstEntry() +" "+ mathScore.lastEntry());

        //9.Write a Java program to get the first (lowest) key and the last (highest) key currently in a map.
        mathScore.firstKey();
        mathScore.lastKey();

        //10. Write a Java program to get a reverse order view of the keys contained in a given map.
        System.out.println(mathScore.descendingKeySet());

        //11. Write a Java program to get a key-value mapping associated with the greatest key less than or equal to the given key.
        System.out.println(mathScore.floorEntry(7));

        //12. Write a Java program to get the greatest key less than or equal to the given key.
        System.out.println(mathScore.floorKey(7));

        //13. Write a Java program to get the portion of a map whose keys are strictly less than a given key.
        System.out.println(mathScore.headMap(7));

        //14. Write a Java program to get the portion of this map whose keys are less than (or equal to, if inclusive is true) a given kek
        System.out.println(mathScore.headMap(10,true));

        //15. Write a Java program to get the least key strictly greater than the given key. Return null if there is no such key.
        System.out.println(mathScore.higherKey(2));

        //16. Write a Java program to get a key-value mapping associated with the greatest key strictly less than the given key. Return null if there is no such key.
        System.out.println(mathScore.lowerEntry(8));

        //17.
        System.out.println(mathScore.lowerKey(2));


    }
}
