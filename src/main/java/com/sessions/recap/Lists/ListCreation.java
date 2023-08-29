package com.sessions.recap.Lists;

import java.util.ArrayList;
import java.util.List;

public class ListCreation {

//    List Creation: Write a program that creates a List of strings and populates it with
//    a few elements. Print out the contents of the list using a loop.

    public static void main(String[] args) {

        List<String> car=new ArrayList<>();

        car.add("Mert");
        car.add("BMW");
        car.add("Audi");
        car.add("Dacia");

        for(String i : car){
            System.out.println(i);
        }

    }
}
