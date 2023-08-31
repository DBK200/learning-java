package com.sessions.session13.recap;

public class Ex1 {

    //Write a program that multiplies two int values and stores the result in an int.
    //What happens if the result is larger than the maximum int value?
    // How can you handle this scenario?
    public static void main(String[] args) {

        int x = 5000;
        int y = 44999;

        long result = (long) x * y;

        if (result > Integer.MAX_VALUE){
            long result1 = x * y;
            System.out.println(result1 + " as long");
        }else {
            System.out.println(result + " as int");
        }

    }

}
