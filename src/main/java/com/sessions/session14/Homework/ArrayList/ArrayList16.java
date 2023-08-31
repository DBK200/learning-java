package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList16 {
    public static void main(String[] args) {
        //Write a Java program to clone an array list to another array list.
        ArrayList<String> colors = new ArrayList<>();
        colors.add("blue");
        colors.add("yellow");
        colors.add("red");


        ArrayList<String> secondArrayList = (ArrayList<String>)colors.clone();
        System.out.println(secondArrayList);



    }
}
