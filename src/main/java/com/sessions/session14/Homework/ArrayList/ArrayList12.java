package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrayList12 {
    public static void main(String[] args) {
        //Write a Java program to extract a portion of a array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors);
        List<String> anotherList = colors.subList(0, 2);
        System.out.println(anotherList);

    }
}
