//18. Write a Java program to test an array list is empty or not.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise18 {
    public static void main(String[] args) {

        List<String> colors = new ArrayList<>();
        colors.add("red");

        System.out.println(colors.isEmpty());
    }
}
