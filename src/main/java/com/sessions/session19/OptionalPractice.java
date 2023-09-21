package com.sessions.session19;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
//        Optional<String> result = System.out.println(words.stream().reduce((s1, s2)->s1 +s2);//orElse("default");
        Optional<String> result = Optional.ofNullable(null);
        if(result.isEmpty()) {
            System.out.println("default...ceva");
        }else{
            System.out.println(result.get());
        }

        Optional<String> stringOptional = Optional.ofNullable("test");
        Optional<String> resultOptional = stringOptional.filter(x->x.length()>72);
        System.out.println(resultOptional.isPresent());
//        System.out.println(resultOptional.get());

        System.out.println(stringOptional.orElseGet(()->"a" + "b"));

        stringOptional.ifPresent(x-> System.out.println(x+ " Inside consumer function"));
        }


}

