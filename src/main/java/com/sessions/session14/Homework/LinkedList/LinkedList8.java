package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList8 {
    public static void main(String[] args) {
        //Write a Java program to insert the specified element at the end of a linked list.

        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.offerLast("Orange");
        System.out.println(colors);
    }
}
