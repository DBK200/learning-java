//8. Write a Java program to sort a given array list.
package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise8 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        Collections.sort(colors);
        System.out.println(colors);
    }
}
