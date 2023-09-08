package com.sessions.session17;

import static com.sessions.session11.abstraction.UserProfile.x;

//The Functions - an operation that takes a single input argument and returns a result
@FunctionalInterface
public interface MyFunctions {
    int squareNumber(int x);

}

class Practice3 {
    public static void main(String[] args) {
        MyFunctions myFunctions = x -> x * x;
        System.out.println(myFunctions.squareNumber(5));
    }
}
