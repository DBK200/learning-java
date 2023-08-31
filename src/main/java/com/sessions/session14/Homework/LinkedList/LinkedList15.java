package com.sessions.session14.Homework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList15 {
    public static void main(String[] args) {
        //Write a Java program of swap two elements in a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        Collections.swap(colors, 0, 2);
        System.out.println(colors);
    }
}
