package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList9 {
    public static void main(String[] args) {
        //Write a Java program to insert some elements at the specified position into a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        LinkedList<String> list1 = new LinkedList<>();
        list1.add("Yellow");
        list1.add("Red");
        colors.addAll(1, list1);
        System.out.println(colors);
    }
}
