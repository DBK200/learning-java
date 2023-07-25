package com.sessions.session8;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class ArrayListClass {

    public static void main(String[] args) {

        // An object of type ArrayList
        ArrayList arList1 = new ArrayList();
        ArrayList arList2 = new ArrayList(2);
        ArrayList arList3 = arList1;

        arList1.add("A string");
        arList1.add(1);
        arList1.add(false);
        System.out.println("[arList1]: " + arList1);

        arList2.add("A string");
        arList2.add(1);
        arList2.add(false);
        System.out.println("[arList2]: " + arList1);

        // Generics <T> , T is the data type
        // List<T> var = new ArrayList<>();
        ArrayList<String> alStrList1 = new ArrayList<>();
        alStrList1.add("BMW");
        alStrList1.add("Audi");
        alStrList1.add("Dacia");
        System.out.println("[arStrList]: " + alStrList1);
        alStrList1.remove("BMW");
        System.out.println("[arStrList]: " + alStrList1);
        System.out.println("[arStrList] is EMPTY is " + alStrList1.isEmpty());
        System.out.println("[arStrList][0]: " + alStrList1.get(0));

        ArrayList<String> alStrList2 = new ArrayList<>();
        alStrList2.add("Mercedes");
        System.out.printf("%s is equal to %s is %b", alStrList1, alStrList2,alStrList1.equals(alStrList2));

        ArrayList<Integer> alAgeList = new ArrayList<>();
        alAgeList.add(2);

        // Converting from Array to ArrayList
        Integer[] arNumbersArray = {2,3,4};
        List<Integer> alNumbersArrayList = Arrays.asList(arNumbersArray);

        System.out.println("[alNumbersArrayList] is " + alNumbersArrayList.getClass());

        // LinkedList
        LinkedList llList = new LinkedList();
        llList.add("Some item");
        llList.addFirst("First item");
        llList.addLast("Last item");
        // Add an element at position 1
        llList.add(1,"Index 1 added item");
        System.out.println("[llList]: " + llList);

        // Retrieves first element, w/o removing it
        System.out.println("First element of [llList] is \"" + llList.peek() + "\"");
        // Retrieves first element and then removes it
        System.out.println("First element of [llList] before {poll} is \"" + llList.poll() + "\"");
        System.out.println("First element of [llList] after {poll} is \"" + llList.peek() + "\"");

        // Wrapper classes
        int x = 10;
        // Explicit out-of-boxing
        Integer xAsInteger1 = Integer.valueOf(x);
        // Implicit out-of-boxing
        Integer xAsInteger2 = x;

        Integer y = 10;
        // Wrapper class unboxing into primitive class
        int iPrimitive = y.intValue();

    }

}
