//13. Write a Java program to compare two array lists.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise13 {
    public static void main(String[] args) {

        List<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("green");

        List<String> colors2 = new ArrayList<>();
        colors2.add("red");
        colors2.add("green");

        //System.out.println(colors1.containsAll(colors2));
        System.out.println(colors1.equals(colors2));
    }
}
