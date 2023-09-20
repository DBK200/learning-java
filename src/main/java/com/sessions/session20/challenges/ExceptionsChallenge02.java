package com.sessions.session20.challenges;

/**
 * <h1>Challenge 2</h1>
 * Write a program that attempts to access an element of an array at an index entered by the user.<br>
 * Handle the case where the index is out of bounds.
 */

public class ExceptionsChallenge02 {
    public static void main(String[] args) {

        String a[] = {"abc", "def", "ghi", "jkl"};
        //a = null;
        try{
            System.out.println(getValue(9, a));
        }
        catch(NullPointerException e){
            System.out.println("The array can't be null.");
        }
        catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Index is out of bounds.");
        }
    }

    private static <T> T getValue(int index, T[] array){
        return array[index];
    }
}
