package com.sessions.session17;

@FunctionalInterface
public interface MyPredicateAV {
    //a boolean value operation that takes a single input argument
    boolean checkSize(String str);
}

class PracticeMyPredicate {
    public static void main(String[] args) {

        MyPredicateAV myPredicate = str -> str.trim().length() > 0;
        System.out.println(myPredicate.checkSize("gge"));
    }
}
