package com.sessions.session9.OtherExamples.ArgumentPassing;

public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue demo = new CallByValue();
        int a = 15;
        int b = 20;

        System.out.println("a and b before call: " + a + " " + b);

        demo.meth(a, b);

        System.out.println("a and b after call: " + a + " " + b);
    }
}
