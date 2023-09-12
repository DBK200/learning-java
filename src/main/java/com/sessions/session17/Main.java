package com.sessions.session17;

import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> myList = List.of("abcd", "abc", "a");
        System.out.println(myList);

        List<String> filteredList = myList.stream().filter(x->x.length()<2).collect(Collectors.toList());
        System.out.println(filteredList);
    }
}
