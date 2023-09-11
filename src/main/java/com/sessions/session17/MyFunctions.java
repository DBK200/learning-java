package com.sessions.session17;

public interface MyFunctions
{
    //The Functions - an operation that takes a single input argument and returns a result
    int squareNumber(int x);
}
class Practice1
{
    public static void main(String[] args)
    {
        MyFunctions myFunctions=(int x)->x+x;
        System.out.println(myFunctions.squareNumber(5));
    }
}
