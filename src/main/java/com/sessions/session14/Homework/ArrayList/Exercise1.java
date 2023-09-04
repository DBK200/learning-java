//1. Write a Java program to create a new array list, add some colors (string) and print out the collection.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise1 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println("Colors list: " + colors);
    }
}
