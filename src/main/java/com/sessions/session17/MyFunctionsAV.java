package com.sessions.session17;

@FunctionalInterface
public interface MyFunctionsAV {
    //takes a single input and returns a result
    int squareNumber(int x);
}

class PracticeMyFunctions{
    public static void main(String[] args) {

        MyFunctionsAV myFunction = x -> x * x;
        System.out.println(myFunction.squareNumber(4));
    }
}
