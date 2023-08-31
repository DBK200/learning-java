package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList18 {
    public static void main(String[] args) {
        // Write a Java program to test an array list is empty or not.
        ArrayList<String> colors = new ArrayList<>();
        boolean empty = colors.isEmpty();
        System.out.println(empty);

        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        empty = colors.isEmpty();
        System.out.println(empty);

    }
}
