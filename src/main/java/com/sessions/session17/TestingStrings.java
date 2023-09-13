package com.sessions.session17;

public class TestingStrings {

    public static void main(String[] args) {
//        String a ="abcd";
//        String b="def";

        Test testReference=(int a,int b,int c)->{return a+b+c+" text";};
        String result= testReference.test(1,2,3);
        System.out.println(result);

    }
}
