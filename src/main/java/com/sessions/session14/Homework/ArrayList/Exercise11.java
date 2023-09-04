//11. Write a Java program to reverse elements in an array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise11 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("pink");

        System.out.println("Original: " + colors);
        Collections.reverse(colors);
        System.out.println("Reversed: " + colors);

    }
}
