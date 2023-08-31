package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList2 {
    public static void main(String[] args) {
        //Write a Java program to iterate through all elements in a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        for(String colors2 : colors){
            System.out.println(colors);
        }
    }
}
