package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList20 {
    public static void main(String[] args) {
        //Write a Java program to retrieve but does not remove, the first element of a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        System.out.println(colors.peekFirst());
    }
}
