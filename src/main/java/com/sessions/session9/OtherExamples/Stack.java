package com.sessions.session9.OtherExamples;

public class Stack {

    int[] stack=new int[10];
    int index;

    public Stack(){
        index=-1;
    }

    //push an item onto the stack
    public void push(int item){
        if(index==9){
            System.out.println("Stack is full");
        }else{
            stack[++index]=item;
        }
    }

    //Pop an item from the stack
    public int pop(){
        if(index<0){
            System.out.println("Stack underflow");
            return 0;
        }else{
            return stack[index--];
        }
    }
}
