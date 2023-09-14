package com.sessions.session18;

import java.util.*;
import java.util.stream.Collectors;

public class StreamPractice {
    public static void main(String[] args) {
        //filtering
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8);
        List<Integer> resultedList = numbers.stream().filter(n -> n % 2 == 0).toList();

        System.out.println(resultedList);
        System.out.println(numbers);

        //mapping
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");

                            //String -> Integer
        List<Integer> legthSet = words.stream().map(x -> x.length()).distinct().collect(Collectors.toList());
        System.out.println(words);
        System.out.println(legthSet);

        List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);

        words.stream().forEach(x -> System.out.println(x));

        //mapping

        List<String> stringList = List.of("add", "fddc", "hghghg", "bbbb");
        List<String> stringList1 = stringList.stream().map(string -> string.toUpperCase()).sorted().toList();
        System.out.println(stringList1);

    }

}
