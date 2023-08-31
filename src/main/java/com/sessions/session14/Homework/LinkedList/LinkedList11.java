package com.sessions.session14.Homework.LinkedList;

import java.util.LinkedList;

public class LinkedList11 {
    public static void main(String[] args) {
        //Write a Java program to display the elements and their positions in a linked list.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");

        for(int i = 0;  i<colors.size(); i++){
            System.out.println("Element at inde " +i+ " : " + colors.get(i));
        }

    }
}
