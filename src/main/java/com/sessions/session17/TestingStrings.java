package com.sessions.session17;

public class TestingStrings {

    public static void main(String[] args) {
//        String a = "abcd";
//        String b = "def";

        // lambda    - in stanga sunt datele de intrare ale metodei test

        // Test testRefference = (String x, String y) -> x.length() == y.length();
        Test testReference = (int a, int b, int c) -> a + b + c + " text";
        String result = testReference.test(1, 2, 3);
        System.out.println(result);
    }
}
