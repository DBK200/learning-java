package com.sessions.session17;
    // The Predicates - a boolean-valued operation that takes a single input argument
@FunctionalInterface
public interface MyPredicate {
    boolean checkSize(String str);

}

class Practice4{
    public static void main(String[] args) {
        MyPredicate myPredicate = str -> {
            //str.toLowerCase();
          // String str1= str.trim();
          return str.trim().length() > 0;
        };
        System.out.println(myPredicate.checkSize("MyDog"));
        System.out.println(myPredicate.checkSize(""));
        System.out.println(myPredicate.checkSize(" "));

    }
}
