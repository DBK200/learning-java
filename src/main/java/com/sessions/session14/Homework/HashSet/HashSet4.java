package com.sessions.session14.Homework.HashSet;

import java.util.HashSet;

public class HashSet4 {
    public static void main(String[] args) {
        //Write a Java program to empty a hash set.
        HashSet<String> colors = new HashSet<>();
        colors.add("Purple");
        colors.add("Orange");
        colors.add("Black");
        System.out.println(colors.removeAll(colors));
    }
}
