//5. Write a Java program to update specific array element by given element.
package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise5 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.set(1, "yellow");
        System.out.println(colors);
    }
}
