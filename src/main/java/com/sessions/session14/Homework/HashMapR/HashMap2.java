package com.sessions.session14.Homework.HashMapR;

import java.util.HashMap;
import java.util.Map;

public class HashMap2
{
    //Write a Java program to get a shallow copy of a HashMap instance.
    public static void main(String[] args)
    {
        Map<String ,String> originalMap=new HashMap<>();
        originalMap.put("cheie1","valoare1");
        originalMap.put("cheie2","valoare2");
        originalMap.put("cheie3","valoare3");
        originalMap.put("cheie4","valoare4");
        originalMap.put("cheie5","valoare5");
        // Create a shallow copy of the original map
        Map<String, String> copyMap = new HashMap<>();
        copyMap.putAll(originalMap);

        // Display the original map
        System.out.println("Original Map: " + originalMap);

        // Display the copied map
        System.out.println("Shallow Copy Map: " + copyMap);

        // Modify the copied map to demonstrate it's a shallow copy
        copyMap.put("key3", "value3");

        // Display the original map again
        System.out.println("Original Map after modifying the copy: " + originalMap);

        // Display the copied map after modification
        System.out.println("Shallow Copy Map after modification: " + copyMap);
    }

}
