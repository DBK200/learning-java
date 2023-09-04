//9. Write a Java program to copy one array list into another.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise9 {
    public static void main(String[] args) {

        List<String> lightColors = new ArrayList<>();
        lightColors.add("red");
        lightColors.add("green");
        lightColors.add("blue");

        List<String> darkColors = new ArrayList<>();
        for(String color: lightColors) {
            darkColors.add(color);
        }
        System.out.println(darkColors);
    }
}
