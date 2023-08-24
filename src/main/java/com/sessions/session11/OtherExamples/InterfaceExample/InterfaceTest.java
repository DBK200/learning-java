package com.sessions.session11.OtherExamples.InterfaceExample;

public class InterfaceTest {
    public static void main(String[] args) {
        FixedStack stack1=new FixedStack(5);
        FixedStack stack2=new FixedStack(8);

        //push some members onto the stack
        for(int i=0;i<5;i++) stack1.push(i);
        for(int i=0;i<8;i++) stack2.push(i);

        //pop those numbers off the stack
//        System.out.println("Stack in stack1: ");
//        for(int i=0;i<5;i++){
//            System.out.println(stack1.pop());
//        }

        System.out.println("Stack in stack2: ");
        for(int i=0;i<8;i++){
            System.out.println(stack2.pop());
        }

        //
//       int[] x= stack1.popNElements(2);
//        System.out.println("Pop N Elements: ");
//        for(int i=0;i<x.length;i++){
//            System.out.println(x[i]);
//        }

        System.out.println();

        int[] y= stack1.skipAndPopNElements(2,1);
        System.out.println("Skip and pop: ");
        for(int i=0;i<y.length;i++){
            System.out.println(y[i]);
        }


    }
}
