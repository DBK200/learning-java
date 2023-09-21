package com.sessions.session20.Homework;

public class Ex2 {
    public static void main(String[] args) {
        //Write a program that attempts to access an element of an array at an index entered by the user. Handle the case where the index is out of bounds.

        int[] array = {1, 2, 3, 4, 5};
        try {
            for (int i = 0; i < array[5]; i++) {
                System.out.println(i);
            }
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Inside catch block - arithmetic exception");
        }

    }
}
