package com.sessions.session17;

import java.util.function.Predicate;

public interface MyPredicates {
    //The Predicates - a boolean-valued operation that takes a single input argument

    boolean checkSize(String str);
}
class Practice4{
    public static void main(String[] args) {
        MyPredicates myPredicates = str -> {
            str.trim();
            str.toLowerCase();
            return str.length() > 1;
        };
        System.out.println(myPredicates.checkSize("Dog"));
        System.out.println(myPredicates.checkSize("Cats"));
        System.out.println(myPredicates.checkSize(" "));

    }
}
