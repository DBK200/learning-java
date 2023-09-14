package com.sessions.session19;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {
        String x = "un stirng calid";

//        x.toUpperCase(); //nu apelam metode pe x daca nu stim ca nu e n
        Optional<String> optionalString = Optional.ofNullable(x);

        optionalString.ifPresent(y-> System.out.println(y.toUpperCase()));

        List<String> words = Arrays.asList("hello", "world", "how", "are", "you");
        Optional<String> result = words.stream().reduce((s1, s2) -> s1 + s2);/*.orElse(" default...ceva");*/
//        Optional<String> result = Optional.ofNullable(x);
        if (result.isEmpty()) {
            System.out.println("default...ceva");
        } else {
            System.out.println(result.get());
        }

        Optional<String> stringOptional = Optional.ofNullable("test");
//        Optional<String> resultOptional = stringOptional.filter(x->x.length()>73);
//        System.out.println(resultOptional.isPresent());
//        System.out.println(resultOptional.get());

//        System.out.println(stringOptional.orElseGet(() -> "a" + "b"));
//        stringOptional.ifPresent(x -> System.out.println(x + " inside consumer function "));

    }


}
