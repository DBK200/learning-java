package com.sessions.session18;

import org.newdawn.slick.opengl.SlickCallable;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {

    public static void main(String[] args) {
        //filtering
//        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
//
//        List<Integer> resultedList = numbers.stream().filter(n -> n % 2 == 0).toList();
//        System.out.println(resultedList);
//        System.out.println(numbers);

        //mapping
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
//        List<String> words = Arrays.asList(5,5,3,3,3);
        // String -> Integer
        List<Integer> lengthSet = words.stream().map(x -> x.length()).distinct().collect(Collectors.toList());

        System.out.println(words);
        System.out.println(lengthSet);

        List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        words.stream().forEach(x -> System.out.println(x));

//        Mapping: Write a program that uses a stream to transform a list of strings
//        to uppercase and then sort them in alphabetical order.

        List<String> stringList = List.of("ergerg", "abc",  "wwWERRgrger3");
        List<String> upperCaseList = stringList.stream().map(s -> s.toUpperCase()).sorted().toList();
        System.out.println(upperCaseList);

    }

}
