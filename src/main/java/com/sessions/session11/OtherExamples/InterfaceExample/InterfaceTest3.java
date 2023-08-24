package com.sessions.session11.OtherExamples.InterfaceExample;

/*
Create an interface variable and access stacks through it
 */
public class InterfaceTest3 {
    public static void main(String[] args) {
        IntStack stack; //create an interface reference variable
        DynStack ds=new DynStack(5);
        FixedStack fs=new FixedStack(8);

        stack=ds; //load dynamic stack
        //push some numbers onto the stack
        for(int i=0;i<12;i++) stack.push(i);

        stack=fs; //load fixed stack
        for(int i=0;i<8;i++) stack.push(i);

        stack=ds;
        System.out.println("Values in dynamic stack");
        for(int i=0;i<12;i++){
            System.out.println(stack.pop());
        }


        stack=fs;
        System.out.println("Values in fixed stack");
        for(int i=0;i<8;i++){
            System.out.println(stack.pop());
        }


    }
}
