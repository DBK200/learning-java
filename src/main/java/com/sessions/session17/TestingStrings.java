package com.sessions.session17;

public class TestingStrings {

    public static void main(String[] args) {
//        String a = "abcd";
//        String b = "def";

        Test testRefference = (int x, int y, int z) -> {
         //input -> logica (procesare date ... orice logica) + return type (output)
            return x + y + x + " text";};
        String result = testRefference.test(1, 2, 3);
        System.out.println(result);

    }
}

