package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList15 {
    public static void main(String[] args) {
        //Write a Java program to join two array lists.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");


        ArrayList<String> secondArrayList = new ArrayList<>();
        secondArrayList.add("first");
        secondArrayList.add("second");
        secondArrayList.add("third");
        ArrayList<String> mergeArrayList = new ArrayList<>();
        mergeArrayList.addAll(secondArrayList);
        mergeArrayList.addAll(colors);
        System.out.println(mergeArrayList);




    }
}
