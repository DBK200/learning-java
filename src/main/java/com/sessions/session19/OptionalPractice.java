package com.sessions.session19;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalPractice {
    public static void main(String[] args) {


        List<String> words = List.of("hello", "world", "how", "are", "you");
      Optional<String> result = words.stream().reduce((s1, s2) -> s1 + s2);//.orElse("default...ceva");
     //   Optional<String> result = Optional.ofNullable(null);
        if (result.isPresent()) {
            System.out.println(result.get());
        }else {

        }

        Optional<String> stringOptional = Optional.ofNullable("test");
//        Optional<String> resultOptional = stringOptional.filter(x-> x.length()>3);
//        System.out.println(resultOptional.isPresent());
//        System.out.println(resultOptional.get());

//        System.out.println(stringOptional.orElseGet(()-> "a" + "b"));

        stringOptional.ifPresent(x-> System.out.println(x+" inside consumer function"));

        String x = null;
        x.toUpperCase();
        Optional<String> OPTIONALs = Optional.ofNullable(x);
        OPTIONALs.ifPresent(y-> System.out.println(y.toUpperCase()));


    }
}
