package com.sessions.session14.Homework.HashSet;

import java.util.*;


public class Exercitii
{
        public static void main(String[] args)
        {
            // //Write a Java program to iterate through all elements in a hash list.

            // Crearea unei liste de tip LinkedList
            LinkedList<String> hashList = new LinkedList<>();

            // Adăugarea elementelor la lista de tip hash
            hashList.add("Element1");
            hashList.add("Element2");
            hashList.add("Element3");
            hashList.add("Element4");

            // Iterarea prin elementele listei folosind bucla for-each
            for (String element : hashList)
            {
                System.out.println("Element: " + element);
            }


            // Write a Java program to get the number of elements in a hash set.

            HashSet<String> hashSet1 = new HashSet<>();
            hashSet1.add("Element1");
            hashSet1.add("Element2");
            hashSet1.add("Element3");
            hashSet1.add("Element4");
            System.out.println("Size: " + hashSet1.size());

            // Write a Java program to empty a hash set.

            HashSet<String> hashSet2 = new HashSet<>();
            hashSet2.add("Element1");
            hashSet2.add("Element2");
            hashSet2.add("Element3");
            hashSet2.add("Element4");
            hashSet2.clear();
            System.out.println(hashSet2);

            // Write a Java program to test if a hash set is empty or not.

            HashSet<String> hashSet3 = new HashSet<>();
            hashSet3.add("Element1");
            hashSet3.add("Element2");
            hashSet3.add("Element3");
            hashSet3.add("Element4");
            if (hashSet3.isEmpty())
            {
                System.out.println("The Hash set is empty");
            } else
            {
                System.out.println("The Hash set is not empty");
            }

            //Write a Java program to clone a hash set to another hash set.

            HashSet<String> hashSet4 = new HashSet<>();
            hashSet4.add("buna");
            hashSet4.add("salut");
            HashSet<String> hashSet5 = new HashSet<>(hashSet4);
            System.out.println(hashSet5);

            //Write a Java program to convert a hash set to an array.

            HashSet<String> hashSet6 = new HashSet<>();
            hashSet6.add("Element1");
            hashSet6.add("Element2");
            hashSet6.add("Element3");

            // Convert the HashSet to an array
            String[] array = new String[hashSet6.size()];
            hashSet6.toArray(array);

            // Print the elements of the array
            System.out.println("Array from HashSet:");
            for (String element : array)
            {
                System.out.println(element);
            }

            //Write a Java program to convert a hash set to a tree set.

            HashSet<String> hashSet7 = new HashSet<>();
            hashSet7.add("Element1");
            hashSet7.add("Element2");
            hashSet7.add("Element3");

            TreeSet<String > treeSet=new TreeSet<>(hashSet7);
            System.out.println(treeSet);

            //Write a Java program to convert a hash set to a List/ArrayList.

            HashSet<String> hashSet8 = new HashSet<>();
            hashSet8.add("Element1");
            hashSet8.add("Element2");
            hashSet8.add("Element3");
            List<String > list=new ArrayList<>(hashSet8);
            System.out.println(list);

            //Write a Java program to compare two hash set.

            HashSet<String> hashSet9 = new HashSet<>();
            hashSet9.add("Element1");
            hashSet9.add("Element2");
            hashSet9.add("Element3");

            HashSet<String> hashSet10 = new HashSet<>();
            hashSet10.add("Element1");
            hashSet10.add("Element2");
            hashSet10.add("Element3");
            if(hashSet9.equals(hashSet10))
            {
                System.out.println("cele doua hash set uri sunt egale");
            }
            else
            {
                System.out.println("Cele doua hash set uri nu sunt egale");
            }

            //Write a Java program to compare two sets and retain elements which are same on both sets.

            hashSet9.retainAll(hashSet10);
            for(String x:hashSet9)
            {
                System.out.println(x);
            }

            //Write a Java program to remove all of the elements from a hash set.

            HashSet<String> hashSet11 = new HashSet<>();
            hashSet11.add("Hei");
            hashSet11.add("Buna");
            hashSet11.add("Salut");
            hashSet11.removeAll(hashSet11);
            System.out.println(hashSet11);



        }
}





