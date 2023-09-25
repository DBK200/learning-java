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

        //supplier -> IN: () OUT: object (returneaza ceva)
        //consumer -> IN: objects... (string) ... OUT: void
        words.stream().forEach(x -> consumerString(x));

        //mapping

        List<String> stringList = List.of("add", "fddc", "hghghg", "bbbb");
        List<String> stringList1 = stringList.stream().map(string -> string.toUpperCase()).sorted().toList();
        System.out.println(stringList1);

        //reduce
        List<Integer> numbers2 = Arrays.asList(1,2,3,4,5,6,7,7,8);
        Integer result = numbers2.stream().reduce(0, (a, b) -> a + b);
        System.out.println(result);
        //Function : x -> y
        //Bifunction: x,y -> z

        System.out.println(words.stream().reduce((s1, s2) -> s1+s2));
        long numOfElements = numbers2.stream().distinct().filter(x-> x>3).count();
        System.out.println(numOfElements);

        boolean isGreaterThan3 = numbers2.stream().anyMatch(x-> x>3);
        System.out.println(isGreaterThan3);

    }
    private static void consumerString(String name){
        System.out.println("altceva");
    }

}
