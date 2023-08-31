package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList19 {
    public static void main(String[] args) {
        //Write a Java program to trim the capacity of an array list the current list size.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors);
        colors.trimToSize();
        System.out.println(colors.size());
    }
}
