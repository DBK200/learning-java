//3. Write a Java program to insert an element into the array list at the first position.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise3 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.add(0, "yellow");
        System.out.println(colors);
    }
}
