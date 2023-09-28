package com.sessions.session14.Homework.HashMapR;
import java.util.HashMap;

public class HashMap1
{
    //1.Write a Java program to associate the specified value with the specified key in a HashMap.
    public static void main(String[] args)
        {
         //create a hash map
         HashMap<String,Integer> hashMap=new HashMap<>();
        // Specify the key and value to associate
        String key = "exampleKey";
        int value = 43;

        // Associate the value with the key in the HashMap
        hashMap.put(key, value);

        // Print the HashMap to verify
        System.out.println("HashMap: " + hashMap);
        }

        //2.Write a Java program to count the number of key-value (size) mappings in a map.








}
