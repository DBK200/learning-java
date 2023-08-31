package com.sessions.session14.Homework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList19 {
    public static void main(String[] args) {
        //Write a Java program to remove and return the first element of a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.pop();
        System.out.println(colors);
    }
}
