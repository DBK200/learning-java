//6. Write a Java program to remove the third element from a array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise6 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        colors.remove(2);
        System.out.println(colors);
    }
}
