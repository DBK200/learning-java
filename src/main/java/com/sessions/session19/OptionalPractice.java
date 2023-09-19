package com.sessions.session19;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        List<String> words= Arrays.asList("hello","world","how","are","you");
        Optional<String> result= Optional.of(words.stream().reduce((s1, s2) -> s1 + s2).orElse("default...ceva"));
//        Optional<String> result= Optional.ofNullable(null);
        if (result.isEmpty()) {
            System.out.println("default");
        }
        else
            System.out.println(result.get());

        Optional<String>stringOptional=Optional.ofNullable("test");
//        Optional<String> resultOptional =stringOptional.filter(x->x.length()>73);
//        System.out.println(resultOptional.isPresent());
//        System.out.println(resultOptional.get());
//
//        System.out.println( stringOptional.orElseGet(()->"a"+"b"));
//        stringOptional.ifPresent(x-> System.out.println(x+"inside consumer function"));
    }
}
