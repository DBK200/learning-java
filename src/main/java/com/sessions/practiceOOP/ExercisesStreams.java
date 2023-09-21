package com.sessions.practiceOOP;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class ExercisesStreams {
//        System.out.println(stringList.stream ().map (Object::toString).reduce((s1, s2) -> s1+s2).orElse(""));

    public static void main(String[] args) {
        //    Exercise 1: Filter and Print Given a list of integers, filter out the even numbers and print the remaining ones.

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        numbers.stream().filter(n -> n % 2 != 0).forEach(System.out::println);

//    Exercise 2: Map and Sum Given a list of strings representing numbers, convert them to integers and calculate their sum.

        List<String> numberStrings = Arrays.asList("1", "2", "3", "4", "5");
        int sum = numberStrings.stream().mapToInt(Integer::parseInt).sum();
        System.out.println("Sum: " + sum);

//    Exercise 3: Sort and Collect Given a list of names, sort them alphabetically and collect them into a new list.

        List<String> names = Arrays.asList("Alice", "Bob", "Eve", "Dave", "Carol");
        List<String> sortedNames = names.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted Names: " + sortedNames);

//    Exercise 4: Find and Optional Given a list of integers, find the first even number greater than 5 and print it.

        List<Integer> numbers2 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Optional<Integer> result = numbers.stream().filter(n -> n % 2 == 0 && n > 5).findFirst();
        result.ifPresent(System.out::println);
    }
}