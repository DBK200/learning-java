package com.sessions.session17;

@FunctionalInterface
public interface MyFunction {

    // The function - an operation that takes a single input argument and returns a result

    int squareNumber(int x);

}

class Number {
    public static void main(String[] args) {
        MyFunction myFunction = (int x) -> x * x;
        System.out.println(myFunction.squareNumber(5));
    }
}
