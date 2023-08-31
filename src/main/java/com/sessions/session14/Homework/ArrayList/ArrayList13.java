package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;


public class ArrayList13 {
    public static void main(String[] args) {
        //Write a Java program to compare two array lists.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Black");
        colors2.add("Pink");
        for(String colors3 : colors){
            colors2.add(colors.contains(colors3) ? "Yes" : "No");
            System.out.println(colors2);
        }
    }
}
