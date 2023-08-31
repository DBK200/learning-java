package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList2 {
    public static void main(String[] args) {
        //Write a Java program to iterate through all elements in a array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        System.out.println(colors);
        for(String colors2 : colors){
            System.out.println(colors);
        }
    }
}
