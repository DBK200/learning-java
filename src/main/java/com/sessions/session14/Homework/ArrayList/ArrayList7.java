package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;

public class ArrayList7 {
    public static void main(String[] args) {
        //Write a Java program to search an element in a array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");
        if (colors.contains("blue")){
            System.out.println("Found the element");
        }else{
            System.out.println("The element does not exist");
        }
    }
}
