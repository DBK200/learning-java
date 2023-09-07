package com.sessions.homework13plus.h13.Hashmap;

import java.util.*;

public class HashmapEx {

    public static void main(String[] args) {
        //1.Write a Java program to associate the specified value with the specified key in a HashMap.
        HashMap<String, Integer> myHashMap = new HashMap<>();
        myHashMap.put("330d", 265);
        myHashMap.put("Giulia Quadrifoglio" , 505);
        myHashMap.put("Urus 4.0", 641);
        myHashMap.put("Megane RS 1.8", 280);
        myHashMap.put("2.3 ecoboost", 315);

        System.out.println(myHashMap);

        //2.Write a Java program to count the number of key-value (size) mappings in a map.
        System.out.println("myHashMap has a size of " + myHashMap.size());

        //3. Write a Java program to copy all of the mappings from the specified map to another map.
        HashMap<String, Integer> cars = new HashMap<>();
        cars.putAll(myHashMap);
        System.out.println(cars);

        //4.Write a Java program to remove all of the mappings from a map.
        myHashMap.clear();

        //5.Write a Java program to check whether a map contains key-value mappings (empty) or not.
        System.out.println("My hashmap is empty? " + myHashMap.isEmpty());

        //6. Write a Java program to get a shallow copy of a HashMap instance.
        myHashMap.clone();

        //7.Write a Java program to test if a map contains a mapping for the specified key.
        myHashMap.containsKey("330d");

        //8.Write a Java program to test if a map contains a mapping for the specified value.
        myHashMap.containsValue(300);

        //9. Write a Java program to create a set view of the mappings contained in a map.
        System.out.println(cars.entrySet());

        //10. Write a Java program to get the value of a specified key in a map.
        System.out.println(cars.get("330d"));

        //11. Write a Java program to get a set view of the keys contained in this map.
        System.out.println(cars.keySet());

        //12. Write a Java program to get a collection view of the values contained in this map.

        System.out.println(cars.values());

    }
}
