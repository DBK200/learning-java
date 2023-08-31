package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList17 {
    public static void main(String[] args) {
        //Write a Java program to empty an array list.

        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.removeAll(colors);
        System.out.println(colors);
    }
}
