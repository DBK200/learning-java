package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList6 {
    public static void main(String[] args) {
        //Write a Java program to remove the third element from a array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        colors.add("white");
        colors.remove(3);
        System.out.println(colors);
    }


}
