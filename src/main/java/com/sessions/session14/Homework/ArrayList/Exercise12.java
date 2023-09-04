//12. Write a Java program to extract a portion of an array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Exercise12 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add("yellow");
        colors.add("pink");

        Object[] sectionOfColors = Arrays.copyOfRange(colors.toArray(), 1,3);
        for(Object color: sectionOfColors) {
            System.out.println(color);
        }

    }
}
