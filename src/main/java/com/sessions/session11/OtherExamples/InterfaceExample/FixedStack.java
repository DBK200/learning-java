package com.sessions.session11.OtherExamples.InterfaceExample;


//An implementation of IntStack that uses fixed storage.
public class FixedStack implements IntStack{
    private int[] stack;
    private int index;

    //allocate and initialize stak
    FixedStack(int size){
        stack=new int[size];
        index=-1;
    }

    //Push an item onto the stack
    @Override
    public void push(int item){
        if(index==stack.length-1) {
            System.out.println("Stack is full");
        }else{
            stack[++index]=item;
        }
    }


    //Pop an item from the stack
    @Override
    public int pop(){
        if(index<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            return stack[index--];
        }
    }
}
