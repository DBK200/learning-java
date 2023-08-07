package com.sessions.session9.OtherExamples.OverloadedMethods;

import com.sessions.session9.OtherExamples.OverloadedMethods.OverloadMethods;

public class OverloadMethodsTest {

    public static void main(String[] args) {
        OverloadMethods demo=new OverloadMethods();
        double result;

        demo.test();
        demo.test(1);
        demo.test(1,2);
        result=demo.test(1.2);
        System.out.println("Result of demo.test(1.2): "+result);
    }
}
