package com.sessions.session14.Homework.HashSet;

import java.util.HashSet;

public class HashSet6 {
    public static void main(String[] args) {
        //Write a Java program to clone a hash set to another hash set.
        HashSet<String> colors = new HashSet<>();
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Black");

        HashSet<String> colors2 = new HashSet<>();
        colors2 = (HashSet<String>)colors.clone();
        System.out.println(colors2);

    }
}
