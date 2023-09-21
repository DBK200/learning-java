package com.sessions.session18;

import java.util.*;
import java.util.stream.Collectors;


public class StreamPractice {
    public static void main(String[] args) {
        //Filtering
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7);

        List<Integer> resultedList = numbers.stream().filter(n -> n % 2 == 0).toList();
        System.out.println(resultedList);

        //Mapping
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
        //List<String> words = Arrays.asList(5, 5, 3, 3, 3);

        List<Integer> lengthSet = words.stream().map(x -> x.length()).distinct().collect(Collectors.toList());
        System.out.println(words);
        System.out.println(lengthSet);


        List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedList);
        //Supplier -> IN: () OUT: object (returneaza ceva)
        //Consumer ->IN: objects...(String)....OUT: void
        words.stream().forEach(x -> System.out.println(x));

        words.stream().forEach(x -> consumeString(x));


        //Mapping

        List<String> stringList = List.of("abc", "egeg", "Egegeer4");
        List<String> upperCaseList = stringList.stream().map(s -> s.toUpperCase()).sorted().toList();
        System.out.println(upperCaseList);

        //reduce                                                         distinct()         filter()    coount()
        List<Integer> numbers1 = Arrays.asList(1,2,3,4,5,6,7,7,8); //->1,2,3,4,5,6,7,8 - > 4,5,6,7,8        5
        Integer result = numbers1.stream().reduce(0,(a,b)-> a+b);
        System.out.println(result);
        long numberOfElements = numbers1.stream().distinct().filter(x->x>3).count();
        System.out.println(numberOfElements);

        //Function: x -> y
        //Bifunction: x,y -> z

        boolean isGreaterThan = numbers1.stream().anyMatch(x->x>7);
        boolean isGreaterThan1 = numbers1.stream().anyMatch(x->x>7);
        boolean isGreaterThan2 = numbers1.stream().noneMatch(x->x>7);
        System.out.println(isGreaterThan);

        System.out.println(words.stream().reduce((s1, s2)->s1 +s2));

    }
private static void consumeString(String name){
    System.out.println(name + " altceva");
}
}

