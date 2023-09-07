package com.sessions.homework13plus.h13.ArrayList;

import com.sessions.session11.abstraction.defaultmethod.A;

import java.util.ArrayList;

public class SecondEx {
    public static void main(String[] args) {
        //2. Write a Java program to iterate through all elements in a array list.
        ArrayList<Integer>  intArray = new ArrayList<>();
        intArray.add(1);
        intArray.add(2);
        intArray.add(3);
        intArray.add(4);
        intArray.add(5);
        int i=0;
        for(Integer nr: intArray) {

            i++;
            int sum = nr + i;
            System.out.println("Original : " + nr +" After" + sum);
        }


    }
}
