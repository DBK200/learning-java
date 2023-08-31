package com.sessions.session14.HashSet;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Integer> numbers = new HashSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(6);
        System.out.println(numbers);
        numbers.add(7);
        System.out.println(numbers);

        for (int i : numbers){
            System.out.println(i);
        }
        System.out.println();

        System.out.println("Size of the list: " + numbers.size());

//        numbers.removeAll(numbers);
//        System.out.println(numbers);

        System.out.println(numbers.isEmpty());

        Set<Integer> clonedSet = new HashSet<>(numbers);
        System.out.println(clonedSet);

        Integer[] numbersArray = numbers.toArray(new Integer[0]);
        System.out.println("Array converted from Hash Set:");
        for (Integer num : numbersArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        Set<Integer> treeSet = new TreeSet<>(numbers);
        System.out.println("Tree Set converted from Hash Set: " + treeSet);
        System.out.println();

        List<Integer> arrayList = new ArrayList<>(numbers);
        System.out.println("ArrayList converted from Hash Set: " + arrayList);

        System.out.println(numbers.equals(clonedSet));

        clonedSet.add(8);
        numbers.retainAll(clonedSet);
        System.out.println(numbers);

        numbers.removeAll(clonedSet);
        System.out.println(numbers);
    }
}
