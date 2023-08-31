package com.sessions.session14.Homework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList16 {
    public static void main(String[] args) {
        //Write a Java program to shuffle the elements in a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
