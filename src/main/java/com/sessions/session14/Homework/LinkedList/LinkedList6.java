package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList6 {
    public static void main(String[] args) {
        //Write a Java program to insert elements into the linked list at the first and last position.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.addFirst("Green");
        colors.addLast("Orange");
        System.out.println(colors);
    }
}
