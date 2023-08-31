package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {
        //Write a Java program to update specific array element by given element.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.set(0,"Pink");
        System.out.println(colors);
    }
}
