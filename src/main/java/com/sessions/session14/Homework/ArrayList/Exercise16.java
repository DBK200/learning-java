//16. Write a Java program to clone an array list to another array list.
package com.sessions.session14.Homework.ArrayList;
import java.util.ArrayList;
import java.util.List;

public class Exercise16 {
    public static void main(String[] args) {

        List<String> colors1 = new ArrayList<>();
        colors1.add("red");
        colors1.add("green");
        colors1.add("blue");

        List<String> colors2 = new ArrayList<>(colors1);
        System.out.println(colors2);
    }
}
