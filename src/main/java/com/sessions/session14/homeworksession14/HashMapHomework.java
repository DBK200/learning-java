package com.sessions.session14.homeworksession14;
import java.util.HashMap;
import java.util.Map;


// A Map doesn't allow duplica KEYS, but allows DUPLICATE VALUES
        // A Map can't be traversed. It has to be converted into a Set using keySet() or entrySet() methods

        // There are two interfaces for implementing Map in Java, Map and SortedMap, and three classes:

        // - HashMap  - stores data in (Key, Value) pairs
        //            - doesn't maintain any order
        //            - we only need to know the KEY VALUE to access a value
        //            - this class uses a technique called HASHING, which supposes converting a large String
        // to a small String because a shorter value helps in indexing and faster searches
        //            - allows NULL keys and values

        // - LinkedHashMap - allows NULL keys and values
        //                 - inherits HashMap class
        //                 - it maintains insertion order
        // - TreeMap - doesn't allow null keys and values
        //             - is the implementation of Map and SortedMap
        //              - it maintains ascending order




public class HashMapHomework {

    public static void main(String[] args) {

        // 1. Write a Java program to associate the specified value with the specified key in a HashMap
        HashMap<Integer, String> dex = new HashMap<>();
        dex.put(1, "aaaaa");
        dex.put(2, "bbbbb");
        dex.put(3, "ccccc");
        dex.put(4, "ddddd");
        dex.put(5, "eeeee");

        // get a value associated with a key
//        String strValue = dex.get(1);
//        System.out.println("The value of 1 is " + strValue);

        // 2. Write a Java program to count the number of key-value (size) mappings in a map
//        System.out.println("The size of dex HashMap is " + dex.size());

        // 3. Write a Java program to copy all of the mappings from the specified map to another map
//        HashMap<Integer, String> dex2 = new HashMap<>();
//        dex2.putAll(dex);
//        System.out.println("Original hashmap: " + dex);
//        System.out.println("Copy: " + dex2);

        // 4. Write a Java program to remove all of the mappings from a map
//        dex2.clear();
//        System.out.println(dex2);

        // 5. Write a Java program to check whether a map contains key-value mappings (empty) or not
//        System.out.println(dex2.isEmpty());
//        HashMap<Integer, String> dex3 = new HashMap<>();
//        System.out.println(dex3.isEmpty());

        // 6. Write a Java program to get a shallow copy of a HashMap instance
//        HashMap<Integer, String> dex3 = new HashMap<>();
//        dex3 =(HashMap<Integer, String>) dex.clone();
//        System.out.println("Clone: " + dex3);

        // 7. Write a Java program to test if a map contains a mapping for the specified key
//        int specifiedKey = 10;
//       if(dex.containsKey(specifiedKey)){
//           String value = dex.get(specifiedKey);            // cu functia nume_map.get() se preiau date despre intrare si anume daca parametrul din paranteze este cheia,
//                                                            // se va returna valoarea corespondenta acestei cheia, iar daca parametrul este valoare, atunci se va returna
//                                                            // cheia corespondenta acestei valori
//
//           System.out.println("The given map contains a mapping for key " + specifiedKey + " and its value is " + value);
//       } else{
//           System.out.println("The given map does not containt a mapping for key " + specifiedKey);
//       }

       // 8. Write a Java program to test if a map contains a mapping for the specified value
//        String specifiedValue = "bbbbb";
//        if(dex.containsValue(specifiedValue)){
//            Integer sKey = Integer.valueOf(dex.get(specifiedValue));
//            System.out.println("The given map contains a mapping for value " + specifiedValue + " and its key is " + sKey );
//        } else{
//            System.out.println("The given map does not contain a mapping for value " + specifiedValue);
//        }

        // 9. Write a Java program to create a set view of the mappings contained in a map
//        for(Map.Entry<Integer, String> entry : dex.entrySet()){
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            System.out.println("key is " + key + " and its value is " + value);
//        }

        // 10. Write a Java program to get the value of a specified key in a map
        Integer specifiedKey = 2;

    }
}
