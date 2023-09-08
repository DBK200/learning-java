package com.sessions.session17;

public class TestingStringsAV {
    public static void main(String[] args) {

        String a = "abcd";
        String b = "def";

        TestAV testReference = (c, d, e) -> {
            //more logic
            int x = 2;
            return c + d + e + x;};
//        TestAV testReference = (int... a) -> " ";
//        testReference.test(1, 2, 3, 4);
        System.out.println(testReference.test(1,2,4));
    }
}
