//19. Write a Java program to trim the capacity of an array list the current list size.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;

public class Exercise19 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(8);
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        colors.trimToSize();
    }
}
