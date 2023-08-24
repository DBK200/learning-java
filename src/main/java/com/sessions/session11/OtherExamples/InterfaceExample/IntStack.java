package com.sessions.session11.OtherExamples.InterfaceExample;


//Define an integer stack interface
public interface IntStack {

    void push(int item); //store an item
    int pop();//retrieve an item


    //default method example --(added later)- this won't break the previous code
    default void clear(){
        //this method would probably throw an UnsupportedOperationException
        System.out.println("clear() not implemented");
    }

//------------ private interface methods example

    //a default method that return an array that contains the top n elements on the stack
    default int[] popNElements(int n){
        //return the requested elements.
        return getElements(n);
    }

    //a default method that returns an array that contains the next n elements
    //ont the stack after skipping elements
    default int[] skipAndPopNElements(int skip, int n){
        //skip the specified number of elemenets
        getElements(skip);

        //return the requested elements.
        return getElements(n);
    }

    //A private method that returns an array containing
    //the top n elements on the stack
    private int[] getElements(int n){
        int[] elements =new int[n];
        for(int i=0;i<n;i++) elements[i]=pop();
        return elements;
    }

}
