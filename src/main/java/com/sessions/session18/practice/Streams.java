package com.sessions.session18.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Streams {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9);

        // stream() doesn't change its source (i.e., [numbers])
        // Filtering data
        List<Integer> evenNumbers = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println("Input list: " + numbers);
        System.out.println("Even numbers from list: " + evenNumbers);

        // Reducing data
        Integer iSum = numbers.stream().filter(n -> n % 2 == 0).reduce(0,(x,y) -> x+y);
        System.out.println("Sum of even numbers: " + iSum);

        // Mapping stream data (i.e., transform data)
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
        Set<Integer> lengthSet = words.stream().map(x -> x.length()).collect(Collectors.toSet());
        System.out.println("Words length in list: " + lengthSet);

        // distinct() method
        List<Integer> lengthList = words.stream().map(x -> x.length()).distinct().collect(Collectors.toList());
        System.out.println("Distinct word lengths in list: " + lengthList);

        // Sorting data
//        List<String> sortedList = words.stream().sorted(Comparator.comparing(x -> x.length())).toList();
        List<String> sortedList = words.stream()
                .sorted((x, y) -> {return (x.length() - y.length() == 0) ? x.compareTo(y) : x.length() - y.length();})
                .toList();
        System.out.println("List sorted by word length and then by string: " + sortedList);

        // Challenge 2
        List<String> stringList = words.stream().map(s -> s.toUpperCase()).sorted(Comparator.naturalOrder()).toList();
        System.out.println(stringList);
    }

}
