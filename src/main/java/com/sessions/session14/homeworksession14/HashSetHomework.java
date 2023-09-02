package com.sessions.session14.homeworksession14;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

// The Set interface represents a collection of unique elements (NO duplicates allowed)
        // It can have 3 implementations: HashSet, LinkedHashSet, TreeSet
        // HashSet - makes no guarantee about the sequence of the elements when you iterate them


public class HashSetHomework {

    public static void main(String[] args) {

        // 1. Write a Java program to append the specified element to the end of a hash set
        HashSet<String> fruits = new HashSet<>();

        fruits.add("strawberries");
        fruits.add("banana");
        fruits.add("cherries");
        fruits.add("plums");

       // System.out.println(fruits);
        fruits.add("pears");
       // System.out.println(fruits);

        // 2. Write a Java program to iterate through all elements in a hash list.
//        for(String fruit : fruits){
//            System.out.println(fruit);
//        }

        // Iterate through the elements using an Iterator

         Iterator<String> iterator = fruits.iterator();
         // iterator can be used to iterate through all Java Collections
//        while(iterator.hasNext()){
//            String element = iterator.next();
//            System.out.println(element);
//        }

        // 3. Write a Java program to get the number of elements in a hashset.
        //System.out.println("The number of elements of fruits HashSet is " + fruits.size());

        // 4. Write a Java program to empty a hash set
//        fruits.clear();
//        System.out.println(fruits);

        // 5. Write a Java program to test a hash set is empty or not
//        fruits.clear();
//        if(fruits.isEmpty()){
//            System.out.println("fruits hashset is empty");
//        } else
//            System.out.println("fruits hashset is not empty");

    // 6. Write a Java program to clone a hash set to another hash set
//        HashSet<String> fruits2 = new HashSet<>();
//        fruits2 = (HashSet<String>) fruits.clone();
//        System.out.println(fruits2);

        // 7. Write a Java program to convert a hash set to an array

        // Create a new array of the same size as the fruits2 hashset
//        String arr[] = new String[fruits2.size()];

        // call the toArray() method to convert the hashset to array
//        fruits2.toArray(arr);

        // print out the elements of the arr array to check the conversion
//        for(String fruit : arr){
//            System.out.println(fruit);
//        }

        // 8. Write a Java program to convert a hash set to a tree set
//        TreeSet<String> fruits2 = new TreeSet<>();
//        for(String element : fruits){
//            fruits2.add(element);
//        }
//
//        System.out.println(fruits);
//        System.out.println(fruits2);

        // 9. Write a Java program to convert a hash set to a List/ArrayList
//        ArrayList<String> fruits2 = new ArrayList<>(fruits);
//        for(String element : fruits){
//            fruits2.add(element);
//        }
//        System.out.println(fruits);
//        System.out.println(fruits2);

        // 10. Write a Java program to compare two hash set
        HashSet<String> fruits2 = new HashSet<>();
        fruits2.add("orange");
        fruits2.add("lemon");
        fruits2.add("lime");
        fruits2.add("ananas");
        fruits2.add("mango");
        fruits2.add("banana");
        fruits2.add("cherries");
//
//        System.out.println(fruits.equals(fruits2));
//        System.out.println(fruits.equals(fruits));

        // 11. Write a Java program to compare two sets and retain elements which are same on both sets   --> with function retainAll()
//        HashSet<String> sameElements = new HashSet<>(fruits);
//        sameElements.retainAll(fruits2);
//        System.out.println(sameElements);

        // 12. Write a Java program to remove all of the elements from a hash set
//        fruits2.clear();;
//        System.out.println(fruits2);





    }
}
