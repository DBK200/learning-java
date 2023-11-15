package com.sessions.session26.recap;

import java.util.ArrayList;
import java.util.List;

public class Problem17 {

    //Consider the following:
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        System.out.println(fruits);
        fruits.remove(0);
        System.out.println(fruits.get(0));
    }
}
/*
What is the output?
a) Apple
b) Banana x
c) An IndexOutOfBoundsException
d) null
 */