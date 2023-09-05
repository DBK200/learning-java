package com.sessions.session14.Homework.HashSet;

import java.util.Collections;
import java.util.HashSet;

public class HashSet7 {
    public static void main(String[] args) {
        //Write a Java program to convert a hash set to an array.
        HashSet<String> colors = new HashSet<>();
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Black");
        String[] string = new String[colors.size()];
        colors.toArray(string);
        for(String element : string){
            System.out.println(element);
        }

    }
}
