package com.sessions.session19;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalPracticeAV {
    public static void main(String[] args) {

//        String myString = null;

//        try {
//            myString.toUpperCase();
//        } catch (Exception e) {
//            System.out.println("handle exception");
//        }

//        if (Objects.isNull(myString)) {
//            System.out.println("user name can not be empty");
//        } else {
//            myString.toUpperCase();
//        }

        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
//        Optional<String> result = words.stream().reduce((s1, s2) -> s1 + s2);
        String result = words.stream().reduce((s1, s2) -> s1 + s2).orElse("default");
        System.out.println(result);

        Optional<String> result2 = Optional.ofNullable(null);
        //System.out.println(result2.get()); // da eroare
        if (result2.isPresent()) {
            System.out.println(result2.get());
        }

        Optional<String> stringOptional = Optional.ofNullable(" test");
        Optional<String> resultOptional = stringOptional.filter(e -> e.length() > 73);
        System.out.println(resultOptional.isPresent());
        System.out.println(resultOptional.orElse("altceva"));
        //System.out.println(resultOptional.get());

        System.out.println(stringOptional.orElseGet(() -> "a" + "b"));

        stringOptional.ifPresent((x) -> System.out.println(x + " consumer"));
    }
}
