package com.sessions.session18.Homework;

import java.util.Arrays;
import java.util.List;

public class Ex5 {
//Create a stream from a List of Strings that in the end reduces all the elements to a single String made from the concatenation
// of all the Strings inside the original collection

    public static void main(String[] args) {
        List<String> listOfStrings = Arrays.asList("abc" + "def" + "hgu");
        listOfStrings.stream().reduce("", String::concat);
    }

}
