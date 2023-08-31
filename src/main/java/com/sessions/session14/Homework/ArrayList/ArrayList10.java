package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList10 {
    public static void main(String[] args) {
        //Write a Java program to shuffle elements in a array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors);
        Collections.shuffle(colors);
        System.out.println(colors);



    }
}
