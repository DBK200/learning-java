package com.sessions.session9.OtherExamples.Recursion;

public class RecursionTest {
    public static void main(String[] args) {
        Factorial f=new Factorial();

        System.out.println("Factorial of 3 is: ");
        System.out.println( f.fact(3));
        System.out.println("Factorial of 4 is: ");
        System.out.println( f.fact(4));
        System.out.println("Factorial of 5 is: ");
        System.out.println( f.fact(5));


        //Example 2

        Recursion rec=new Recursion(10);
        for(int i=0;i<10;i++) rec.values[i]=i;

        rec.printArray(5);

    }
}
