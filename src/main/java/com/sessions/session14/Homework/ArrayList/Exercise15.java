//15. Write a Java program to join two array lists.
package com.sessions.session14.Homework.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Exercise15 {
    public static void main(String[] args) {

        List<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("green");

        List<String> colors2 = new ArrayList<>();
        colors2.add("blue");
        colors2.add("pink");

        List<String> colors = new ArrayList<>();
        colors.addAll(colors1);
        colors.addAll(colors2);
        System.out.println(colors);
    }
}
