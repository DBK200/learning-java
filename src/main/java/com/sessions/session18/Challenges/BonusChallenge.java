package com.sessions.session18.Challenges;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class BonusChallenge {
    //Create a stream from a List of Strings that in the end reduces all the
    // elements to a single String made from the concatenation of all the Strings inside the original collection


    public static void main(String[] args) {

        List<String> stringList = List.of("Anna", " ","has", " ",  "apples ", "!");
        String concatenatedList = stringList.stream().reduce("",(x, y) -> x + y);

        System.out.println(concatenatedList);
    }
}
