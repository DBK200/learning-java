//14. Write a Java program of swap two elements in an array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise14 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");

        System.out.println(colors);
        Collections.swap(colors,0,1);
        System.out.println(colors);
    }
}
