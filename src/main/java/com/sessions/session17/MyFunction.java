package com.sessions.session17;

public interface MyFunction {
    //The Functions - an operation that takes a single input argument and returns a result

    int squareNumber(int x);

}

class Practice3 {
    public static void main(String[] args) {

        MyFunction myFunction = x -> x * x;
        System.out.println(myFunction.squareNumber(5));
    }
}
