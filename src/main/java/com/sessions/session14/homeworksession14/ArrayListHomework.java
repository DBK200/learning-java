package com.sessions.session14.homeworksession14;

import com.sessions.session11.abstraction.defaultmethod.A;
import com.sun.security.jgss.GSSUtil;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListHomework {

    public static void main(String[] args) {

        // 1. Write a Java program to create a new array list,
        // add some colors (string) and print out the collection.

//        ArrayList<String> colors = new ArrayList<>();
//        String color1 = "pink";
//        String color2 = "yellow";
//        String color3 = "green";
//        String color4 = "purple";
//        String color5 = "black";
//        colors.add(color1);
//        colors.add(color2);
//        colors.add(color3);
//        colors.add(color4);
//        colors.add(color5);
//
//        System.out.println("The elements of color ArrayList are:");
//        for( String color : colors){
//            System.out.println(color + " ");
//        }

        // 2. Write a Java program to iterate through all elements in a array list.
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(17);
//        numbers.add(22);
//        numbers.add(55);
////        for(Integer number : numbers){
////            System.out.println(number);
////        }
//
//        for(int i=0; i < numbers.size(); i++){
//            System.out.println("Element at " + i + " is " + numbers.get(i));
//        }

        // 3. Write a Java program to insert an element into the array list at the first position.
//                ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(17);
//        numbers.add(22);
//        numbers.add(55);
//        numbers.add(0, 77);
//
//        for(Integer number : numbers){
//            System.out.println(number);
//        }

        // 4. Write a Java program to retrieve an element (at a specified index) from a given array list.
//        ArrayList<Integer> numbers = new ArrayList<>();
//        numbers.add(5);
//        numbers.add(7);
//        numbers.add(17);
//        numbers.add(22);
//        numbers.add(55);

        // remove element at index 3
//        numbers.remove(3);
//        for(Integer number : numbers){
//            System.out.println(number);
//        }

        // 5. Write a Java program to update specific array element by given element.

      ArrayList<Integer> numbers = new ArrayList<>();
                numbers.add(5);
                numbers.add(7);
                numbers.add(17);
                numbers.add(22);
                numbers.add(55);

               // numbers.set(2, 99);
//                for(int i=0; i < numbers.size(); i++){
//                    System.out.println("Element at index " + i + " is " + numbers.get(i));
//                }

                // 6. Write a Java program to remove the third element from an array list.
        //numbers.remove(2);

                // 7. Write a Java program to search an element in an array list.
//        boolean contain = numbers.contains(73);
//        System.out.println(contain);

        // 8. Write a Java program to sort a given array list.
//        Collections.sort(numbers);
//        System.out.println("Sorted ArrayList is: " + numbers);

        // 9. Write a Java program to copy one array list into another.
//        ArrayList<Integer> numbers2 = new ArrayList<>();
//        numbers2 = numbers;
//        System.out.println(numbers2);

        // 10. Write a Java program to shuffle elements in an array list.
//        Collections.shuffle(numbers);
//        System.out.println(numbers);

        // 11. Write a Java program to reverse elements in an array list.
//        Collections.reverse(numbers);
//        System.out.println(numbers);

        // 12. Write a Java program to extract a portion of an array list.
//        List<Integer> numbers2 = new ArrayList<>();
//         numbers2 = numbers.subList(0, 2); // face o noua lista pornind de la primul index inclusiv si pana la al 2-lea index,
//                                            // pe care NU il include
//        System.out.println(numbers2);

        // 13. Write a Java program to compare two arraylists.
        ArrayList<Integer> numbers2 = new ArrayList<>();
//        numbers2.add(5);
//        numbers2.add(7);
//        numbers2.add(17);
//        numbers2.add(22);
//        numbers2.add(55);

        numbers2.add(55);
        numbers2.add(77);
        numbers2.add(122);
        numbers2.add(515);
        numbers2.add(99);
        numbers2.add(99);

//        boolean equals = numbers.equals(numbers2);
//        System.out.println(equals);

        // 14. Write a Java program of swap two elements in an array list.
        Collections.swap(numbers, 0, 2);
        System.out.println(numbers);

        // 15. Write a Java program to join two array lists.
        ArrayList<Integer> joinedArrayList = new ArrayList<>();
        joinedArrayList.addAll(numbers);
        joinedArrayList.addAll(numbers2);
        System.out.println(joinedArrayList);

        //
    }
}
