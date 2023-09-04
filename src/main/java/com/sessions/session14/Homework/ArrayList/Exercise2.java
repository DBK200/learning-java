//2. Write a Java program to iterate through all elements in an array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise2 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");
        colors.add("green");
        colors.add("blue");
        System.out.println("Colors: ");
        for(String color: colors) {
            System.out.println(color);
        }
    }
}
