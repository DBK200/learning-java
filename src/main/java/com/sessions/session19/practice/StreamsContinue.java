package com.sessions.session19.practice;

import java.util.Arrays;
import java.util.List;

public class StreamsContinue {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
        words.stream().forEach(s -> consumerString(s));

        // Reduce
        String sConcat = words.stream().reduce("", (s1, s2) -> s1.concat(s1.isBlank() ? "" : "-").concat(s2));
        System.out.println(sConcat);

        List<Integer> numbers = Arrays.asList(1,2,2,3,4,5,6,7,8,9);
        int iSum = numbers.stream().reduce(0, (a, b) -> a + b);
        System.out.println("The sum of list elements: " + iSum);

        long lCount = numbers.stream().distinct().filter(x -> x > 3).count();
        System.out.println("Number of distinct and greater than 3 list elements: " + lCount);

        // anyMatch(), allMatch(), noneMatch()
        boolean isGraterThan10 = numbers.stream().anyMatch(x -> x > 10);

    }

    private static void consumerString(String name) {
        System.out.println(name + " plus something else");
    }

}
