package com.sessions.session11.practice.abstraction.defaultmethod;

public class ClassC implements InterfaceA,InterfaceB {

    public String calculateNumbers() {
        // 1. Overrides any declarations
//        return "Inside class C";

        // 2. Interface declaration to specify where the method is
        return InterfaceA.super.calculateNumbers();
    }

    public static void main(String[] args) {
        new ClassC().calculateNumbers();
    }
}
