package com.sessions.session11.OtherExamples.InterfaceExample;

//Implement a "growable" stack
public class DynStack implements IntStack{

    private int[] stack;
    private int index;

    //allocate and initialize stack
    DynStack(int size){
        stack=new int[size];
        index=-1;
    }

    //Push an intem onto the stack
    @Override
    public void push(int item){
        //if stack is full, allocate a larger stack
        if(index==stack.length-1){
            int[] temp=new int[stack.length *2]; //double size
            for(int i=0;i<stack.length;i++) temp[i]=stack[i];
            stack=temp;
            stack[++index]=item;
        }else{
            stack[++index]=item;
        }
    }

    //Pop an item from the stack
    @Override
    public int pop(){
        if(index<0){
            System.out.println("Stack underflow.");
            return 0;
        }else{
            return stack[index--];
        }
    }
}
