package com.sessions.session18;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamPracticeAV {
    public static void main(String[] args) {
        //filtering
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7);
//
//        List<Integer> resultedList = numbers.stream().filter(n -> n % 2 == 0).toList();
//        System.out.println(resultedList);
//        System.out.println(numbers);

        //mapping
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
        List<Integer> lengthSet = words.stream().map(x -> x.length()).distinct().collect(Collectors.toList());
        System.out.println(words);
        System.out.println(lengthSet);

        List<String> sortedList =
            words.stream().sorted(Comparator.comparing(a -> a.length())).collect(Collectors.toList());
        System.out.println(sortedList);

        words.stream().forEach(x -> System.out.println(x));



    }

}
