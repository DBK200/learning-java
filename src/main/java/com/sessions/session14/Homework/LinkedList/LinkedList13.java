package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList13 {
    public static void main(String[] args) {
        //Write a Java program to remove first and last element from a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.removeFirst();
        colors.removeLast();
        System.out.println(colors);
    }
}
