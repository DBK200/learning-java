package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList8 {
    public static void main(String[] args) {
        //Write a Java program to sort a given array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors);
        Collections.sort(colors);
        System.out.println(colors);
    }
}
