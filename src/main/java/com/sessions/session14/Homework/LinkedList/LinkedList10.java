package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList10 {
    public static void main(String[] args) {
        //Write a Java program to get the first and last occurrence of the specified elements in a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors.getFirst());
        System.out.println(colors.getLast());

    }
}
