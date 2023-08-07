package com.sessions.session9.OtherExamples.Recursion;

public class Recursion {

    int[] values;

    public Recursion(int i){
        values=new int[i];
    }

    //display array --recursively
    void printArray(int i){
        if(i==0) return;
        else printArray(i-1);
        System.out.println("["+ (i-1) + "] "+ values[i-1]);
    }
}
