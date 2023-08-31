package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList12 {
    public static void main(String[] args) {
        //Write a Java program to remove a specified element from a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.remove(0);
        System.out.println(colors);
    }
}
