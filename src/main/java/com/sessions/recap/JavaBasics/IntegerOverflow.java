package com.sessions.recap.JavaBasics;

public class IntegerOverflow {

//    Integer Overflow: Write a program that multiplies two int values and stores the result in an int.
//    What happens if the result is larger than the maximum int value? How can you handle this scenario?

    private static int multiplies(int x,int y){
        long n=(long) x*y;
        if(n>2147483647)
        {
            System.out.println("The result is larger than the maximum int value");
            return 0;
        }
        else{
            System.out.println("The result is:");
            return x*y;
        }
    }

    public static void main(String[] args) {

//        System.out.println(multiplies(1000,35));
//        System.out.println(multiplies(2147483647,2));
    }
}
