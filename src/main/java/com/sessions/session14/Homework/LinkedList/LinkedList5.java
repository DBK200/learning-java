package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList5 {
    public static void main(String[] args) {
        //Write a Java program to insert the specified element at the specified position in the linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        colors.add(2,"Green");
        System.out.println(colors);
    }
}
