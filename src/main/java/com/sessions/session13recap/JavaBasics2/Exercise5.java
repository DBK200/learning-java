package com.sessions.session13recap.JavaBasics2;

import java.security.DomainLoadStoreParameter;

public class Exercise5 {

    static int staticVariable = 10;

    public static void main(String[] args) {
        {
            int localVariable = 10;
            System.out.println("Local variable: " + localVariable);
        }

        Demo demo1 = new Demo();
        demo1.instanceVariable = 10;
        System.out.println("Instance variable: " + demo1.instanceVariable);

        System.out.println("Static variable: " + staticVariable);
    }
}
