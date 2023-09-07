package com.sessions.homework13plus.h13.ArrayList;

import java.util.ArrayList;

public class FirstEx {
    //1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
    public static void main(String[] args) {
        ArrayList<String> myArrayList = new ArrayList<>();
        myArrayList.add("green");
        myArrayList.add("yellow");
        myArrayList.add("red");
        myArrayList.add("blue");
        myArrayList.add("purple");
        System.out.println(myArrayList);
        for(String color: myArrayList){
            System.out.println(color);
        }
    }
}
