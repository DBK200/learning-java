package com.sessions.recap;

import java.util.Arrays;
import java.util.List;

public class Problem20 {

    //Consider:
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Alice", "Bob");
        printFirstItem(names);
    }

    public static <T> void printFirstItem(List<T> list) {
        System.out.println(list.get(0));
    }
}
/*
What will the program print?
a) Alice x
b) Bob
c) null
d) An IndexOutOfBoundsException
 */