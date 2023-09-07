package com.sessions.homework13plus.h13.Hashset;

import java.util.*;

public class Hashset {
    public static void main(String[] args) {
        //1. Write a Java program to append the specified element to the end of a hash set.
        HashSet<String> myHashSet = new HashSet<>();
        myHashSet.add("0");
        myHashSet.add("1");
        myHashSet.add("2");
        myHashSet.add("3");
        myHashSet.add("4");
        myHashSet.add("5");
        myHashSet.add("6");
        myHashSet.add("7");

        myHashSet.add("END");
        System.out.println(myHashSet);

        //2. Write a Java program to iterate through all elements in a hash list.
        myHashSet.iterator();

        //3.Write a Java program to get the number of elements in a hash set.
        System.out.println("The size of this hashset is equal to " + myHashSet.size());

        //4. Write a Java program to empty a hash set.
       // myHashSet.clear();

        //5. Write a Java program to test a hash set is empty or not.
        System.out.println("My hashset is empty " + myHashSet.isEmpty());

        //6. Write a Java program to clone a hash set to another hash set.
        HashSet<String> myHashSet2 = new HashSet<>(myHashSet);

        //7. Write a Java program to convert a hash set to an array.
        System.out.println(Arrays.toString(myHashSet2.toArray()));

        //8. Write a Java program to convert a hash set to a tree set.
        TreeSet<String> myTreeSet = new TreeSet<>(myHashSet2);

        //9. 9. Write a Java program to convert a hash set to a List/ArrayList.
        List<String> myList = new ArrayList<>(myHashSet2);

        //10. Write a Java program to compare two hash set.
        myHashSet.equals(myHashSet2);

        //11. Write a Java program to compare two sets and retain elements which are same on both sets.
        myHashSet.retainAll(myHashSet2);

        //12. Write a Java program to remove all of the elements from a hash set.
        myHashSet.removeAll(myHashSet);

    }
}
