package com.sessions.homework13plus.h13.ArrayList;

import java.util.ArrayList;

public class ThirdEx {
    //3. Write a Java program to insert an element into the array list at the first position.
    public static void main(String[] args) {
        ArrayList<String> myArray = new ArrayList<>();
        myArray.add("a");
        myArray.add("a");
        myArray.add("a");
        myArray.add("a");
        myArray.add("a");
        myArray.add(0,"PRIMUL");
        System.out.println(myArray);
    }
}
