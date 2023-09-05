package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collection;


public class ArrayList13 {
    public static void main(String[] args) {
        //Write a Java program to compare two array lists.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Black");
        colors.add("Pink");
        colors.add("Red");
        ArrayList<String> colors2 = new ArrayList<>();
        colors2.add("Black");
        colors2.add("Pink");
        System.out.println(colors.containsAll(colors2));

//        for(String colors3 : colors){
//            colors2.add(colors.contains(colors3) ? "Yes" : "No");
//            System.out.println(colors2);
//        }
    }
}
