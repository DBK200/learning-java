package com.sessions.session19.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Optionals {

    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");

        // inline use of orElse()
        String sResult = words.stream().reduce((s1, s2) -> s1.concat(s2)).orElse("default value");

        Optional<String> opResult1 = words.stream().reduce((s1, s2) -> s1.concat(s2));

        // Using Optional.isEmpty() Optional.isPresent()
        Optional<String> opResult2 = Optional.ofNullable(null);
        if (opResult2.isEmpty()) System.out.println("default value");
        else System.out.println(opResult2.get());


        Optional<String> stringOptional = Optional.ofNullable("test");
        Optional<String> resultOptional = stringOptional.filter(x -> x.length() > 3); // 3: test

        // 1. Using validation
        System.out.println((resultOptional.isEmpty()) ? resultOptional : resultOptional.get());
        // 2. Using orElseGet()
        System.out.println(resultOptional.orElseGet(() -> "null"));

        // 3. Using ifPresent(Consumer)
        resultOptional.ifPresent(s -> System.out.println(s.concat(" inside consumer")));
    }
}
