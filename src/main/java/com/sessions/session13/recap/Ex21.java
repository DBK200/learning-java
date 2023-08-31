package com.sessions.session13.recap;

import java.util.ArrayList;
import java.util.List;

public class Ex21 {
    //Write a program that creates a List of strings and populates it with a few elements.
    // Print out the contents of the list using a loop.

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("car");
        list.add("cat");
        list.add("bike");
        list.add("apple");

        for (String e : list){
            System.out.println(e);
        }
    }

}
