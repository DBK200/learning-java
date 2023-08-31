package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList14 {
    public static void main(String[] args) {
        //Write a Java program of swap two elements in an array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors);
        Collections.swap(colors,1,2);
        System.out.println(colors);
    }
}
