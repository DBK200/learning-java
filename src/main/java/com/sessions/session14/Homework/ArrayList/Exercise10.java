//10. Write a Java program to shuffle elements in a array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Exercise10 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("pink");

        System.out.println("Before shuffling: " + colors);
        Collections.shuffle(colors);
        System.out.println("After shuffling: " + colors);

    }
}
