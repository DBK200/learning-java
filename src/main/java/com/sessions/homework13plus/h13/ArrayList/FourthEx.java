package com.sessions.homework13plus.h13.ArrayList;

import java.util.ArrayList;

public class FourthEx {
    public static void main(String[] args) {
//        4. Write a Java program to retrieve an element (at a specified index) from a given array list.


        ArrayList<Integer> myArray= new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);

        System.out.println("The element at the index 3 is " + myArray.get(3));
    }
}
