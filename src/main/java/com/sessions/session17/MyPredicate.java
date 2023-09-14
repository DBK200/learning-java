package com.sessions.session17;
@FunctionalInterface
public interface MyPredicate {
    //The Predicates - a boolean-valued operation that takes a single input argument

    boolean checkSize(String str);
}

class Size{
    public static void main(String[] args) {
        MyPredicate myPredicate = (String str) -> str.length() > 0;

        System.out.println(myPredicate.checkSize("My Dog"));
    }
}
