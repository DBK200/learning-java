package com.sessions.session14.Homework.LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList4 {
    public static void main(String[] args) {
        //Write a Java program to iterate a linked list in reverse order.
        LinkedList<String> colors = new LinkedList<>();
        colors.add("Pink");
        colors.add("Blue");
        colors.add("White");
        colors.add("Black");
        Iterator it = colors.descendingIterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }


    }
}
