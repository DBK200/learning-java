package com.sessions.session18;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
//        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
////        List<String> words = Arrays.asList(5,5,3,3,3);
//        // String -> Integer
//        List<Integer> lengthSet = words.stream().map(x -> x.length()).distinct().collect(Collectors.toList());
//
//        System.out.println(words);
//        System.out.println(lengthSet);
//
//        List<String> sortedList = words.stream().sorted().collect(Collectors.toList());
//        System.out.println(sortedList);

        //Supplier -> IN: () OUT: object (returneaza ceva)
        //Cosumer ->   IN: objects..(String)... OUT: void
  //      words.stream().forEach(x -> consumeString(x));

//        words.stream().forEach(x -> {
//        Mapping: Write a program that uses a stream to transform a list of strings
//        to uppercase and then sort them in alphabetical order.

//        List<String> stringList = List.of("ergerg", "abc",  "wwWERRgrger3");
//        List<String> upperCaseList = stringList.stream().map(s -> s.toUpperCase()).sorted().toList();
//        System.out.println(upperCaseList);

        //reduce                                                       distinct()       filter()      count()
//        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,7,8); /*->1,2,3,4,5,6,7,8 -> 4,5,6,7,8 -> 5*/
//        Integer result = numbers.stream().reduce(1, (a,b)->a+b);
//        System.out.println(result);
        //Function: x -> y
        //Bifunction: x,y -> z
        //count
//        long numberOfElements = numbers.stream().distinct().filter(x->x>3).count();
//        System.out.println(numberOfElements);
//        boolean isGreaterThan3 = numbers.stream().anyMatch(x->x>7);
//        boolean isGreaterThan3 = numbers.stream().noneMatch(x->x>7);
//        boolean isGreaterThan3 = numbers.stream().allMatch(x->x>7);
     //   System.out.println(isGreaterThan3);

    }

//    private static void consumeString(String name){
//        System.out.println(name + " altceva");
//    }

}
