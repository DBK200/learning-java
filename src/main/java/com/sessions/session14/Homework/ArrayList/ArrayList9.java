package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList9 {
    public static void main(String[] args) {
        //Write a Java program to copy one array list into another.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");

        ArrayList<String> secondArrayList = new ArrayList<>();
        secondArrayList.add("first");
        secondArrayList.add("second");
        secondArrayList.add("third");
        Collections.copy(secondArrayList, colors);
        System.out.println(secondArrayList);
    }
}
