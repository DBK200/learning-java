//20. Write a Java program to increase the size of an array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;

public class Exercise20 {
    public static void main(String[] args) {

        ArrayList<String> colors = new ArrayList<>(3);
        colors.add("red");
        colors.add("green");
        colors.add("blue");

        colors.ensureCapacity(6);
    }
}
