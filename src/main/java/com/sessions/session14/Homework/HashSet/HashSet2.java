package com.sessions.session14.Homework.HashSet;

import java.util.HashSet;

public class HashSet2 {
    public static void main(String[] args) {
        //Write a Java program to iterate through all elements in a hash list.
        HashSet<String> colors = new HashSet<>();
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Black");
        for(String iterate : colors){
            System.out.println(iterate);
        }
    }
}
