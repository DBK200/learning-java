package com.sessions.session11.OtherExamples.InterfaceExample;

public class InterfaceTest2 {
    public static void main(String[] args) {
        DynStack stack1=new DynStack(5);
        DynStack stack2=new DynStack(8);

        //these loops cause each stack to grow
        for(int i=0;i<12;i++) stack1.push(i);
        for(int i=0;i<20;i++) stack2.push(i);

        //pop those numbers off the stack
        System.out.println("Stack in stack1: ");
        for(int i=0;i<12;i++){
            System.out.println(stack1.pop());
        }

        System.out.println("Stack in stack2: ");
        for(int i=0;i<20;i++){
            System.out.println(stack2.pop());
        }
    }
}
