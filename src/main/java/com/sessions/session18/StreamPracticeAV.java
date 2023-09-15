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
        words.stream().forEach(x -> consumeString(x));

        //reduce
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,8);
        Integer result = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);

        //Supplier: IN: () OUT: object
        //Consumer: IN: objects OUT: void
        //Function: x-> y
        //Bifundtion: (x, y)-> z
        //Predicate: x -> boolean

        long numberOfElements = numbers.stream().distinct().count();
        System.out.println(numberOfElements);

        boolean isGreaterThan3 = numbers.stream().anyMatch(x-> x > 30);
        boolean isGreaterThan30 = numbers.stream().noneMatch(x-> x > 30);
        boolean isGreaterThan310 = numbers.stream().allMatch(x-> x > 310);
        System.out.println(isGreaterThan3);
        System.out.println(isGreaterThan30);
        System.out.println(isGreaterThan310);

        words.stream().reduce((a, b) -> a + b).get();


    }

    private static void consumeString(String name) {
        System.out.println(name + "altceva");
    }
}
