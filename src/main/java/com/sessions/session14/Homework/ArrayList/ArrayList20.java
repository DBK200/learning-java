package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList20 {
    public static void main(String[] args) {
        //Write a Java program to increase the size of an array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.ensureCapacity(200);
        System.out.println(colors);
    }
}
