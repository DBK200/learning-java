package com.sessions.session18.Challenges;

import java.util.List;

public class Challenge2 {

    //Mapping: Write a program that uses a stream to
    // transform a list of strings to uppercase and then sort them in alphabetical order.

    public static void main(String[] args) {

        List<String> stringList = List.of("Masina", "Telefon", "Ananas", "Bucatarie");
        List<String> sortedList = stringList.stream().sorted().map(a -> a.toUpperCase()).toList();
        System.out.println(sortedList);
    }

}
