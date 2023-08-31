package com.sessions.session14.Homework.LinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedList18 {
    public static void main(String[] args) {
        //Write a Java program to clone an linked list to another linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        LinkedList<String> colors2 = new LinkedList<>();
        colors2.add("Purple");
        colors2.add("Green");
        colors2 = (LinkedList)colors.clone();
        System.out.println(colors2);
    }
}
