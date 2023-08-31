package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayList3 {
    public static void main(String[] args) {
        //Write a Java program to insert an element into the array list at the first position.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.add(0,"Orange");
        System.out.println(colors);
    }
}
