//4. Write a Java program to retrieve an element (at a specified index) from a given array list.
package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise4 {

    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println(colors.get(1));
    }
}
